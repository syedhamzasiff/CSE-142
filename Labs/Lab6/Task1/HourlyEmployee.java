public class HourlyEmployee extends Employee{
    private double hourly_wage;
    private int no_hours_worked;

    public HourlyEmployee(String fname, String lname, double hourly_wage, int no_hours_worked) {
        super(fname, lname);
        this.hourly_wage = hourly_wage;
        this.no_hours_worked = no_hours_worked;
    }

    public double getHourly_wage() {
        return hourly_wage;
    }

    public void setHourly_wage(double hourly_wage) {
        this.hourly_wage = hourly_wage;
    }

    public int getNo_hours_worked() {
        return no_hours_worked;
    }

    public void setNo_hours_worked(int no_hours_worked) {
        this.no_hours_worked = no_hours_worked;
    }
    public double earning(){
        return no_hours_worked * hourly_wage;
    }

    @Override
    public String toString() {
        return super.toString() + "HourlyEmployee{" +
                "hourly_wage=" + hourly_wage +
                ", no_hours_worked=" + no_hours_worked +
                '}';
    }
}
