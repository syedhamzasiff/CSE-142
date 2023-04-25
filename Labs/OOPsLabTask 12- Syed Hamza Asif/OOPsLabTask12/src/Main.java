public class Main {
    public static void main(String[] args) {
        Project project = new Project(10000, 30);
        project.addEmployee(new Programmer("Hamza", 1001, 100, 1));
        project.addEmployee(new Programmer("Asif", 1002, 120, 2));
        project.addEmployee(new Tester("Hamza1", 2001, 200));
        project.addEmployee(new Tester("Asif1", 2002, 250));

        int daysOverdue = project.doProject();

        if (daysOverdue == 0) {
            System.out.println("The project was completed on time!");
        } else {
            System.out.println("The project was completed " + daysOverdue + " days late.");
        }



    }
}