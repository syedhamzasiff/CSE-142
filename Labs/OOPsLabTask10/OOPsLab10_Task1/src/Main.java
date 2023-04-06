public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(500, 300, "Hamza", "Asif");

        System.out.println(person1.computeTotalWealth());
        System.out.println(person1.getName());

        PersonInterface personInterface1 = person1;

        boolean b1 = (person1 == personInterface1);
        System.out.println("Do person1 and personinterface1 point to the same object instance? " + b1);

        PersonInterface personinterface2 = new Person(3000, 4000, "Dadu", "Daniel");
        System.out.println(personinterface2.getName());
        System.out.println(personinterface2.computeTotalWealth());
    }
}