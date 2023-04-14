public class DuckFactory {
    public static Duck createDuck(String type) {
        Duck duck = null;
        switch (type) {
            case "mallard":
                duck = new MallardDuck();
                duck.setFlyBehavior(new FlyWithWings());
                duck.setQuackBehavior(new Quack());
                break;
            case "rubber":
                duck = new RubberDuck();
                duck.setFlyBehavior(new FlyNoWay());
                duck.setQuackBehavior(new Sqeak());
                break;
            case "readhead":
                duck = new ReadHeadDuck();
                duck.setFlyBehavior(new FlyWithWings());
                duck.setQuackBehavior(new Quack());
                break;
            case "decoy":
                duck = new DecoyDuck();
                duck.setFlyBehavior(new FlyNoWay());
                duck.setQuackBehavior(new MuteQuack());
                break;
        }
        return duck;
    }
}
