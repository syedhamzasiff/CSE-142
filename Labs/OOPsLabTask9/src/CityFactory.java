import java.util.ArrayList;
import java.util.Random;

public class CityFactory {
    private ArrayList<City> cities;
    private ArrayList<City> balochistanCities;
    private ArrayList<City> kpkCities;
    private ArrayList<City> punjabCities;
    private ArrayList<City> sindhCities;
    private ArrayList<City> azadKashmirCities;

    public CityFactory(ArrayList<City> cities) {
        this.cities = cities;
        this.balochistanCities = new ArrayList<>();
        this.kpkCities = new ArrayList<>();
        this.punjabCities = new ArrayList<>();
        this.sindhCities = new ArrayList<>();
        this.azadKashmirCities = new ArrayList<>();

        for (City city : cities) {
            String adminName = city.getAdmin_name();
            if (adminName.equals("Balochistan")) {
                balochistanCities.add(city);
            }
            else if (adminName.equals("Khyber Pakhtunkhwa")) {
                kpkCities.add(city);
            }
            else if (adminName.equals("Punjab")) {
                if (city.getCity().equals("Islamabad")) {
                    punjabCities.add(city);
                }
                else {
                    punjabCities.add(city);
                }
            }
            else if (adminName.equals("Sindh")) {
                sindhCities.add(city);
            }
            else if (adminName.equals("Azad Kashmir")) {
                azadKashmirCities.add(city);
            }
        }
    }

    public City getCity(String adminName) throws Exception {
        ArrayList<City> cities;
        if (adminName.equals("Balochistan")) {
            cities = balochistanCities;
        }
        else if (adminName.equals("Khyber Pakhtunkhwa")) {
            cities = kpkCities;
        }
        else if (adminName.equals("Punjab")) {
            cities = punjabCities;
        }
        else if (adminName.equals("Sindh")) {
            cities = sindhCities;
        }
        else if (adminName.equals("Azad Kahsmir")) {
            cities = azadKashmirCities;
        }
        else {
            throw new IllegalArgumentException("Invalid admin name");
        }

        if (cities.isEmpty()) {
            throw new Exception("No cities left in this region");
        }

        Random random = new Random();
        int index = random.nextInt(cities.size());
        City city = cities.remove(index);
        return city;
    }
}
