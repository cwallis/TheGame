/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

import cs.clemson.edu.hamptos.adventure.helper.HParser;
import edu.clemson.cs.hamptos.adventure.AdventureLocation;
import edu.clemson.cs.hamptos.adventure.AdventureTarget;
import edu.clemson.cs.hamptos.adventure.AdventureWindow;

/**
 *
 * @author Mark
 */
public class TheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        AdventureLocation startLocation = new Entranceway("This is a description");
        AdventureTarget key = new Key();
        AdventureWindow userInterface = new AdventureWindow(startLocation, new HParser());
    }
}
