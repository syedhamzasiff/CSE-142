public class University {
    public static void main(String[] args) {
        Course OOPs = new Course("CSE 142", "OOPs", "Samreen");

        Student s1 = new Student(26975, "hamza", "syedhamzasiff");
        Student s2 = new Student(11223, "asif", "hamza.asif");

        OOPs.addStudent(s2);
        OOPs.addStudent(s1);

        s1.addGrade(20, 30, 20);
        s1.addGrade(35, 50, 50);
        s1.addGrade(5, 20, 30);

        System.out.println(OOPs.getStudentGrade(s1));




    }
}
