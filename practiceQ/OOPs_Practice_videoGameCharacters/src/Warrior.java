public class Warrior extends Character{
    public Warrior() {
        super("Warrior", 5, 100);
    }

    @Override
    public void attack() {
        System.out.println("i am a warrior");
    }
}
