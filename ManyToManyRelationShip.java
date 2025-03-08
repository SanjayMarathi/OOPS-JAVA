import java.util.*;

class Student {
    private final String name;
    private final List<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public void displayCourses() {
        for(int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            System.out.println("Course : " + course.getName());
        }
    }
}

class Course {

    private final String name;
    private final List<Student> students;
    Course(String name){
        this.name = name;
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void displayStudents() {
        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Name : " + student.getName());
        }
    }
}

public class ManyToManyRelationShip {
    public static void main(String[] args) {
        Course mathematics = new Course("Math");
        Course computerscience = new Course("CSE");

        Student student1 = new Student("Sanjay");
        Student student2 = new Student("Ganeshdarshan");

        student1.addCourse(computerscience);
        student1.addCourse(mathematics);
        mathematics.addStudent(student1);
        computerscience.addStudent(student1);

        student2.addCourse(computerscience);
        student2.addCourse(mathematics);
        mathematics.addStudent(student2);
        computerscience.addStudent(student2);

        System.out.println("\nMatheMatics Students :");
        mathematics.displayStudents();

        System.out.println("\nComputerScience Students :");
        computerscience.displayStudents();

        System.out.println("\n" + student1.getName() + " Courses :");
        student1.displayCourses();

        System.out.println("\n" + student2.getName() + " Courses :");
        student2.displayCourses();
    }
}
