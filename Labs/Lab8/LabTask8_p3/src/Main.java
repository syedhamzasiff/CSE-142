public class Main {
    public static void main(String[] args) {

        Mammal platypus1 = new Platypus();
        platypus1.givesMilk();

        Platypus platypus2 = new Platypus();
        platypus2.givesMilk();
        platypus2.laysEggs();

        Flyer bat1 = new Bat();
        bat1.flies();

        Bat bat2 = new Bat();
        bat2.flies();

        Flyer chimera1 = new Chimera();
        chimera1.flies();

        WaterBreather chimera2 = new Chimera();
        chimera2.waterBreathing();

        EggLayer chimera3 = new Chimera();
        chimera3.laysEggs();

        MilkProvider chimera4 = new Chimera();
        chimera4.givesMilk();
    }
}