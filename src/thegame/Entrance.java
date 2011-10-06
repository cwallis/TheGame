/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

import edu.clemson.cs.hamptos.adventure.AdventureCommand;
import edu.clemson.cs.hamptos.adventure.AdventureEngine;
import edu.clemson.cs.hamptos.adventure.AdventureLocation;
import edu.clemson.cs.hamptos.adventure.AdventureTarget;
import edu.clemson.cs.hamptos.adventure.AdventureWindow;
import edu.clemson.cs.hamptos.adventure.DoNotUnderstandException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mark
 */
class Entranceway implements AdventureLocation {
    private String description;
    private Set<AdventureTarget> localTargets;
    public Entranceway(String newDescription) {
        description = newDescription;
        localTargets = new HashSet<AdventureTarget>() {};
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void doCommand(AdventureCommand c, AdventureEngine e, AdventureWindow w) throws DoNotUnderstandException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<AdventureTarget> getLocalTargets() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addLocalTarget(AdventureTarget t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeLocalTarget(AdventureTarget t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsLocalTarget(AdventureTarget t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
