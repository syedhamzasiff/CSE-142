public abstract class Character {
    private String name;
    private int xpPoints;
    private int healthPoints;

    public Character(String name, int xpPoints, int healthPoints) {
        this.name = name;
        this.xpPoints = xpPoints;
        this.healthPoints = healthPoints;
    }

    public abstract void attack();

    @Override
    public String toString() {
        return name + " xpPoints=" + xpPoints +" healthPoints=" + healthPoints;
    }
}
