public class Person {
    public String Name;
    public int Age;
    public Pet Pet;

    public Person(String Name, int Age, Pet Pet){
        this.Name = Name;
        this.Age = Age;
        this.Pet = Pet;
    }
    public String getDetails(){
        return "Name: "+Name+
                "\nAge: " +Age+
                "\n" + Pet.getDetails();
    }
}
