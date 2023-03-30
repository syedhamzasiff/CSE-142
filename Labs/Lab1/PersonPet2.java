public class PersonPet2 {
    public static void main(String[] args) {
        Pet pet = new Pet("Fido", "Labrador", 5);
        Person person = new Person("John", 25, pet);

        System.out.println(person.getDetails());
    }
}
