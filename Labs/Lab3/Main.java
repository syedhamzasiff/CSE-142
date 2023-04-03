public class Main {
    public static void main(String[] args) {
        System.out.println("Lawyer:");
        Lawyer lawyer = new Lawyer();
        System.out.println("Vacation Days: " + lawyer.getVacationDays());
        System.out.println("Vacation Form: " + lawyer.getVacationForm());
        lawyer.sue();

        System.out.println();

        System.out.println("Secretary:");
        Secretary secretary = new Secretary();
        secretary.takeDictation("abc xyz dictation");

        System.out.println();

        System.out.println("Legal Secretary: ");
        LegalSecretary legal_sec = new LegalSecretary();
        System.out.println("Salary: " + legal_sec.getSalary());
        legal_sec.fileLegalBriefs();

        System.out.println();

        System.out.println("Marketer");
        Marketer marketer = new Marketer();
        System.out.println("Salary: " + marketer.getSalary());
        marketer.advertise();

        System.out.println();

        System.out.println("Janitor: ");
        Janitor janitor = new Janitor();
        System.out.println("Hours: " + janitor.getHours());
        System.out.println("Salary: " + janitor.getSalary());
        System.out.println("Vacation Days: " + janitor.getVacationDays());
    }
}