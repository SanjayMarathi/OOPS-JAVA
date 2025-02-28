class School {
    private final String name;
    School() {
        name = "DSP";
    }
    void getSchoolName() {
        System.out.println("School Name :" + name);
    }
}

class Student extends School{
    private final String name;
    Student(String name) {
        this.name = name;
    }
    void getStudentName() {
        System.out.println("Student Name :" + name);
    }
}


public class InheritenceIntroduction {
    public static void main(String[] args) {
        // School school = new School();
        Student student = new Student("Sanjay");

        student.getSchoolName();
        student.getStudentName();
    }
}
