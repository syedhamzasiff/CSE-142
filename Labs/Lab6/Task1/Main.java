
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalaryEmployee("hamza", "asif", 220.0);
        employees[1] = new HourlyEmployee("someone", "random", 17.0, 40);
        employees[2] = new HourlyEmployee("the", "person", 20.0, 35);
        employees[3] = new HourlyEmployee("doesn't", "work", 400.0, 10);
        employees[4] = new SalaryEmployee("yes", "someone", 10000.0);

        for (Employee employee:employees) {
            System.out.println(employee);
            if (employee instanceof SalaryEmployee)
                System.out.println(((SalaryEmployee) employee).earning());
            else if (employee instanceof HourlyEmployee)
                System.out.println(((HourlyEmployee) employee).earning());
        }

    }
}