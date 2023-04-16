import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Car> cars = new ArrayList<Car>();

        ArrayList<Truck> trucks = new ArrayList<Truck>();

        Random random = new Random();

        Stack stack = new Stack();

        Queue queue = new Queue();


        int numCars = random.nextInt(801) + 200;

        File file = new File("cars.txt");
        Scanner scanner = new Scanner(file);

        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String name = scanner.nextLine().trim();
            scanner.nextLine();
            String priceString = scanner.nextLine().split(" ")[1].replace(",", "");
            double price = Double.parseDouble(priceString.substring(2));
            String new_price_roadworthyString = scanner.nextLine().split(" ")[3].replace(",", "");
            double new_price_roadworthy = Double.parseDouble(new_price_roadworthyString.substring(2));
            String[] road_tax = scanner.nextLine().split(" ");
            int road_tax_min = Integer.parseInt(road_tax[2].replace("-", ""));
            int road_tax_max = Integer.parseInt(road_tax[4].replace(",", ""));
            String body_type = scanner.nextLine().split(":")[1].trim();
            String transmission = scanner.nextLine().split(":")[1].trim();
            int seats = Integer.parseInt(scanner.nextLine().split(":")[1].trim());
            char segment = scanner.nextLine().split(":")[1].trim().charAt(0);
            String intro = scanner.nextLine().split(":")[1].trim();
            String end = "";
            if (scanner.hasNextLine()) {
                end = scanner.nextLine().split(":")[1].trim();
            }

            Car car = new Car(name, price, new_price_roadworthy, road_tax_min, road_tax_max, 5, body_type, 0, transmission, seats, segment, intro, end);
            cars.add(car);
            scanner.nextLine();
        }

        for (Car c : cars) {
            System.out.println(c);
        }

        Truck truck = new Truck(stack);
        truck.load(cars.get(0));
        truck.load(cars.get(1));
        truck.load(cars.get(2));
        truck.load(cars.get(3));

        TransportingFerry ferry = new TransportingFerry(queue);
        trucks.add(truck);


    }

}