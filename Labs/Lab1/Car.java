/*Create a class called “Car” that has the following properties:
• Make (string)
• Model (string)
• Year (int)
• Color (string)
• Number of wheels (int)
• Number of doors (int)
Create a main method that creates an array of 3 Car objects and sets their properties using the constructor.
Then, call the details method for each object and print the result.
 */

public class Car {
    public String Make;
    public String Model;
    public int Year;
    public String Color;
    public int Number_of_wheels;
    public int Number_of_doors;

    public Car(String Make,String Model, int Year, String Color, int Number_of_wheels, int Number_of_doors){
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Color = Color;
        this.Number_of_wheels = Number_of_wheels;
        this.Number_of_doors = Number_of_doors;
    }

    public String details(){
        return "Make: " + Make +
                "\nModel: " + Model +
                "\nYear: " + Year +
                "\nColor: " + Color +
                "\nNumber of Wheels: " + Number_of_wheels +
                "\nNumber of Door: " + Number_of_doors;
    }

}
