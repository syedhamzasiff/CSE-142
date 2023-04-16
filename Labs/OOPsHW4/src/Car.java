public class Car {

    private String name;
    private double price;
    private double new_price_roadworthy;
    private int road_tax_min;
    private int road_tax_max;
    private int doors;
    private String body_type;
    private int speed;
    private String transmission;
    private int seats;
    private char segment;
    private String intro;
    private String end;

    public Car(String name, double price, double new_price_roadworthy, int road_tax_min, int road_tax_max, int doors, String body_type, int speed, String transmission, int seats, char segment, String intro, String end) {
        this.name = name;
        this.price = price;
        this.new_price_roadworthy = new_price_roadworthy;
        this.road_tax_min = road_tax_min;
        this.road_tax_max = road_tax_max;
        this.doors = doors;
        this.body_type = body_type;
        this.speed = speed;
        this.transmission = transmission;
        this.seats = seats;
        this.segment = segment;
        this.intro = intro;
        this.end = end;
    }
}
