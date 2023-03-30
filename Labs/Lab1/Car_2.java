public class Car_2 {
    public static void main(String[] args) {
        Car car[] = new Car[3];
        car[0] = new Car("Ford", "Mustang", 2020, "Red", 4, 2);
        car[1] = new Car("Honda", "Civic", 2019, "White", 4, 4);
        car[2] = new Car("Tesla", "Model S", 2019, "Black", 4, 4);

        for (int i = 0; i < car.length; i++) {
            System.out.println("Car "+ (i+1) + ": ");
            System.out.println(car[i].details());
            System.out.println();
        }
    }
}
