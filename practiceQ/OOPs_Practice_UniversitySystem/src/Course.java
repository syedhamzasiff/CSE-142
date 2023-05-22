import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseTitle;
    private String courseInstructor;
    private ArrayList<Student> studentsList;

    public Course(String courseCode, String courseTitle, String courseInstructor) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseInstructor = courseInstructor;
        studentsList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentsList.add(student);
    }
    public void removeStudent(Student student){
        studentsList.remove(student);
    }
    public double getStudentGrade(Student student){
        return student.getGrade();
    }



}
