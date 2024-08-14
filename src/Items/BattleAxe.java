package Items;

public class BattleAxe extends Item {

    private int damage = 30;

    public BattleAxe() {
        super("BATTLE AXE");
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
