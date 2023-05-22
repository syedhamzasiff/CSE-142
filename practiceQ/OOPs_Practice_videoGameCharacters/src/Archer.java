public class Archer extends Character{
    public Archer() {
        super("Archer", 20, 50);
    }


    @Override
    public void attack() {
        System.out.println("i am an archer");
    }
}
