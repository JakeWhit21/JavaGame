package Items;

public class Axe extends Item {

    private int damage = 30;

    public Axe() {
        super("AXE");
    }
    
    @Override
    public String getDescription() {
        return String.format("A shiny battle axe");
    }

    @Override
    public int getDamage() {
        return damage;
    }
    
}
