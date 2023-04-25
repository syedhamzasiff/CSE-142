import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Project {
    private int linesOfCode;
    private int linesOfCodeWritten;
    private int linesOfCodeTested;
    private int duration;
    private ArrayList<Employee> employees;
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public Project(int linesOfCode, int duration) {
        this.linesOfCode = linesOfCode;
        this.duration = duration;
        this.linesOfCodeWritten = 0;
        this.linesOfCodeTested = 0;
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int doProject() {
        int daysOverdue = 0;
        Random rand = new Random();
        while (linesOfCodeTested < linesOfCode) {
            for (Employee employee : employees) {
                int linesOfWork = employee.work();
                if (employee instanceof Programmer) {
                    linesOfCodeWritten += linesOfWork;
                } else if (employee instanceof Tester) {
                    linesOfCodeTested += linesOfWork;
                }
            }
            daysOverdue++;
            if (daysOverdue > duration) {
                System.out.println("Whats the name of the Employee");
                String name = sc.nextLine();
                System.out.println("enter id");
                int id = sc.nextInt();
                System.out.println("enter rate");
                double rate = sc.nextDouble();
                if (linesOfCodeWritten > linesOfCodeTested) {
                    addEmployee(new Tester(name, id, rate));
                } else {
                    System.out.println("enter time");
                    int time = sc.nextInt();
                    addEmployee(new Programmer(name, id, rate, time));
                }
            }
        }
        return Math.max(daysOverdue - duration, 0);
    }

}

