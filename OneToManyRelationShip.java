import java.util.*;

class Student {
    private final String name;
    private final String id;
    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public String getId() {
        return id;
    }
}

class College {
    private final String name;
    private final ArrayList<Student> students;
    College(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("College " + name);
        for(int i = 0; i < students.size(); i++) {
            Student  student = students.get(i);
            System.out.println("Student Name : " + student.getName() + ", Student Id : " + student.getId());
        }
    }
}

public class OneToManyRelationShip {
    public static void main(String []args) {
        Student student1 = new Student("Sanjay Marathi", "1AH22CS146");
        Student student2 = new Student("Ganeshdarshan Bhat", "1BY22AI234");
        College college = new College("University Of Yellapur");
        college.addStudent(student1);
        college.addStudent(student2);
        college.displayStudents();
    }
}
