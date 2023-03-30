import java.util.*;

class Student {
    private String firstName;
    private String lastName;
    private String[] courses = new String[10];
    private String[] totalcourses = {"Math", "Science", "English", "Urdu", "Chinese"};

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        for (int i = 0; i < 10; i+=2) {
            courses[i] = totalcourses[i/2];
            courses[i+1] = Integer.toString(getRandomMark());
        }
    }
    private int getRandomMark() {
        Random random = new Random();
        return random.nextInt(101);
    }
    private String[] calculateGrade() {
        String[] grades = new String[5];
        for (int i = 0; i < 10; i += 2) {
            String course = courses[i];
            int mark = Integer.parseInt(courses[i+1]);

            if (mark>=93) {
                grades[i/2] = course + ": A";
            } else if (mark>=88) {
                grades[i/2] = course + ": A-";
            } else if (mark>=83) {
                grades[i/2] = course + ": B";
            } else if (mark>=65) {
                grades[i/2] = course + ": C";
            } else {
                grades[i/2] = course + ": F";
            }
        }
        return grades;
    }
    public String getDetails(){
        String[] grades = calculateGrade();
        String details = "First name: " + firstName + "\nLast name: " + lastName + "\n";
        for (String grade : grades) {
            details += grade + "\n";
        }
        return details;
    }
    public static String[] getRandomName(String[] firstNames, String[] lastNames){
        Random random = new Random();
        int firstIndex = random.nextInt(firstNames.length);
        int lastIndex = random.nextInt(lastNames.length);
        return new String[]{firstNames[firstIndex], lastNames[lastIndex]};
    }
}



