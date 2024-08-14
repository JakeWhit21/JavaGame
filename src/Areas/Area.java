package Areas;
// This is the abstract class for an area in the game.
// Put all of the area functionality in here.
public abstract class Area {
    private String name;
    private Area home, woods, castle;

    public Area(String name) {
        this.name = name;
    }

    public abstract String getDescription();

}
