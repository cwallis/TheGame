/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

import edu.clemson.cs.hamptos.adventure.AdventureCommand;
import edu.clemson.cs.hamptos.adventure.AdventureEngine;
import edu.clemson.cs.hamptos.adventure.AdventureTarget;
import edu.clemson.cs.hamptos.adventure.AdventureWindow;
import edu.clemson.cs.hamptos.adventure.DoNotUnderstandException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mark
 */
class Key implements AdventureTarget {
    private Set<String> references;
    private String description, shortDescription;
    public Key() {
        references = new HashSet();
        references.add("Key");
    }

    @Override
    public boolean canBeReferredToAs(String text) {
        if(references.contains(text))
            return true;
        return false;
    }

    @Override
    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void doCommandTo(AdventureCommand c, AdventureEngine e, AdventureWindow w) throws DoNotUnderstandException {
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doCommandWith(AdventureCommand c, AdventureEngine e, AdventureWindow w) throws DoNotUnderstandException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
