
class Passport {

    private final String passportNumber;

    Passport (String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
}

class Student {
    private final String name;
    private final Passport passport;

    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public void displayDetails() {
        System.out.println("Student name " + name);
        System.out.println("Passport number "+ passport.getPassportNumber());
    }

}

public class OneToOneRelationShip {
    public static void main(String[] args) {
        Passport passport = new Passport("122434");
        Student student = new Student("sanjay", passport);
        student.displayDetails();
    }
}
