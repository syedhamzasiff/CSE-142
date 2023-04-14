import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc =  new Scanner(new File("pk.csv"));

        String[] firstLine = sc.nextLine().split(",");

        ArrayList<City> cities = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] entries = sc.nextLine().split(",");
            String city = entries[0];
            double lat = Double.parseDouble(entries[1]);
            double lng = Double.parseDouble(entries[2]);
            String country = entries[3];
            String iso2 = entries[4];
            String admin_name = entries[5];
            cities.add(new City(city, lat, lng, country, iso2, admin_name));
        }

        CityFactory cityFactory = new CityFactory(cities);

        City city = cityFactory.getCity("Sindh");
        System.out.println(city);
        City anotherCity = cityFactory.getCity("Sindh");
        System.out.println(anotherCity);
    }
}