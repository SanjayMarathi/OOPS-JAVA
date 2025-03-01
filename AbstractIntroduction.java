
abstract class Car {
    abstract void start();
}

class ManualCar extends Car{
    @Override
    void start() {
        System.out.println("Car should be started manually.");
    }
}
class Automatic extends Car {
    @Override
    void start() {
        System.out.println("Car started automatically");
    }
}

public class AbstractIntroduction {
    public static void main(String[] args) {
        Car mc = new ManualCar();
        Car ac = new Automatic();
        mc.start();
        ac.start();
    }
}
