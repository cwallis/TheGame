/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

import edu.clemson.cs.hamptos.adventure.AdventureCommand;
import edu.clemson.cs.hamptos.adventure.AdventureEngine;
import edu.clemson.cs.hamptos.adventure.AdventureLocation;
import edu.clemson.cs.hamptos.adventure.AdventureParser;
import edu.clemson.cs.hamptos.adventure.AdventureTarget;
import edu.clemson.cs.hamptos.adventure.NoSuchTargetException;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Mark
 */
class MyParser implements AdventureParser {

    @Override
    public AdventureCommand parse(String command, AdventureEngine e) throws NoSuchTargetException {
        String delimiters = "[ ]+";
        String[] strCommand = command.split(delimiters);
        AdventureTarget t = new NoExistingTarget();
        AdventureCommand retCom;
        int tarLoc = -1;
        for(int i = 1; i < strCommand.length; i++){
            t = findTarget(strCommand[1], e);
            if(t != null){
                tarLoc = i;
                break;
            }
        }
        if(tarLoc < 0)
            throw new NoSuchTargetException(command);
        else
            retCom = new AdventureCommand(strCommand[0],t,strCommand[strCommand.length-1]);
        return retCom;
        
    }

    private AdventureTarget findTarget(String string, AdventureEngine e) throws NoSuchTargetException{
        Set<AdventureTarget> setTars = e.getPlayerInventory();
        AdventureLocation currLoc = e.getPlayerLocation();
        AdventureTarget testTar;
        
        //Search Inventory
        Iterator i = setTars.iterator();
        while(i.hasNext()){
            testTar = (AdventureTarget)i.next();
            if(testTar.canBeReferredToAs(string))
               return testTar;
        }
        
        //Search Environment
        setTars = currLoc.getLocalTargets();
        i = setTars.iterator();
        while(i.hasNext()){
            testTar = (AdventureTarget)i.next();
            if(testTar.canBeReferredToAs(string))
               return testTar;
        }
        return null;
    }
    
}
