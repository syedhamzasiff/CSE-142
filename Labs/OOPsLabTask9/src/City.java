public class City {
    private String city;
    private double lat;
    private double lng;
    private String country;
    private String iso2;
    private String admin_name;

    public City(String city, double lat, double lng, String country, String iso2, String admin_name) {
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.iso2 = iso2;
        this.admin_name = admin_name;
    }
    public String getCity() {
        return city;
    }
    public String getAdmin_name() {
        return admin_name;
    }
    @Override
    public String toString() {
        return city;
    }
}
