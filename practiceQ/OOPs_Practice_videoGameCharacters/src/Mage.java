public class Mage extends Character{
    public Mage() {
        super("Mage", 10, 200);
    }
    @Override
    public void attack() {
        System.out.println("I am a mage");
    }
}
