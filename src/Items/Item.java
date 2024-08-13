package Items;

public abstract class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public abstract int getDamage();

    public String getName() {
        return name;
    }
}
