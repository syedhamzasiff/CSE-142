public class SalaryEmployee extends Employee{
    private double weeklySalary;

    public SalaryEmployee(String fname, String lname, double weeklySalary) {
        super(fname, lname);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public double earning(){
        return weeklySalary * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "SalaryEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
