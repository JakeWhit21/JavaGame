package Areas;

import Entities.Player;
import iface.Restable;

// Home will be a safe place where the player can sit and rest
// to regenerate their hp
public class Home extends Area implements Restable{
    
    public Home() {
        super("HOME");
    }

    @Override
    public String getDescription() {
        return String.format("This is your home, you may rest to restore your hp");
    }

    @Override
    public String rest(Player player) {
        return String.format("You have rested and regained all of your HP");
    }
}
