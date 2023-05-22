public class CharacterFactory {

    public static Character createCharacter(String character) {
        switch (character) {
            case "Archer":
                return new Archer();
            case "Mage":
                return new Mage();
            case "Warrior":
                return new Warrior();
            default:
                System.out.println("You have not selected a character");
                return null;
        }
    }
}
