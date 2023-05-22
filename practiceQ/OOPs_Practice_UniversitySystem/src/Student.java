public class Student {
    private int studentID;
    private String name;
    private String contactInfo;
    private double grade = 0.0;

    public Student(int studentID, String name, String contactInfo) {
        this.studentID = studentID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public double getGrade() {
        return grade;
    }

    public void addGrade(double grade, double maxMarks, int weightage) {
        this.grade += ((grade/maxMarks)*weightage);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", grade=" + grade +
                '}';
    }
}
