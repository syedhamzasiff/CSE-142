public class Janitor extends Employee{

    public Janitor(){

    }
    public int getHours(){
        return super.getHours()*2;
    }
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    public int getVacationDays() {
        return super.getVacationDays()/2;
    }

    public void clean(){
        System.out.println("Working for the man.");
    }
}
