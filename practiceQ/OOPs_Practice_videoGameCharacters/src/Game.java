import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CharacterFactory characterFactory = new CharacterFactory();

        System.out.println("Which character do you want to choose?");
        String character1 = sc.next();
        Character character = characterFactory.createCharacter(character1);

        System.out.println("Which character do you want to choose?");
        String character2 = sc.next();
        Character character3 = characterFactory.createCharacter(character2);

        System.out.println(character);
        System.out.println(character3);
    }
}
