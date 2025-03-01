interface CarInterFace{
    public void start();
    public void numberOfGears();

    default void airBags() {
        System.out.println("Car has 4 AirBags");
    }

    static void vehicalType() {
        System.out.println("Its a Car");
    }
}

class ManualCar implements CarInterFace {
    @Override
    public void start() {
        airBags();
        System.out.println("Manual Car is Starting..");
    }
    @Override
    public void numberOfGears(){
        System.out.println("Manual Car has 5 gears");
    }
}

public class IntefaceIntroduction {
    public static void main(String[] args) {
        CarInterFace car = new ManualCar();
        car.start();
    }
}
