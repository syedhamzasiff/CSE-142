public class Pet {
    public String Name;
    public String Breed;
    public int Age;

    public Pet(String Name, String Breed, int Age){
        this.Name = Name;
        this.Breed = Breed;
        this.Age = Age;
    }
    public String getDetails(){
        return "Name: "+Name+
                "\nBreed: " +Breed+
                "\nAge: " + Age;
    }


}
