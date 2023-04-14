public class Main {
    public static void main(String[] args) {

        Duck mallard = DuckFactory.createDuck("decoy");
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubberDuck = DuckFactory.createDuck("rubber");
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

    }
    /*
    Reason for choosing the Factory Design Pattern:
    I have choosed the factory design pattern because it provides a flexible
    way to add more ducks later when the show designers decide to add more ducks and
    the person doesnt have to go in each of the classes to implement the code, it just needs to create a
    new duck Class and extend it to the Duck Class, and then provide its implementation in the Duck factory. This
    provides a centralized place for object creation and makes the code easy to maintain.
     */
}