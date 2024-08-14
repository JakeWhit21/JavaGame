import Areas.Area;
import Areas.Home;
import Entities.Player;

public class Game {
    private Area currentArea;
    private Player player;
    
    public Game() {
        // Create player and assign it to field
        Player player = new Player();
        this.player = player;

        // Create all the areas here
        Area home = new Home();

        // Set current area to home
        currentArea = home;
    }

    // Perhaps add a start game method
}
