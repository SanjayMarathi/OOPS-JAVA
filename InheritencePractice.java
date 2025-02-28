
class Product {
    private final String name;
    private final String category;
    private final double price;
    Product(String name, String category, double price)  {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    void displaydetails() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
    }
}
class Electronics extends Product {
    private final int warrentyPeriodInYears;
    private final String brand;
    Electronics(String name, String category, double price, int warrentyPeriodInYears, String brand) {
        super(name, category, price);
        this.warrentyPeriodInYears = warrentyPeriodInYears;
        this.brand = brand;
    }
    @Override
    void displaydetails() {
        super.displaydetails();
        System.out.println("WarrentyPeriod :" + warrentyPeriodInYears);
        System.out.println("Brand : " + brand);
    }
}
public class InheritencePractice {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("TV","Home Appliences" ,20000, 5, "LG");
        electronics.displaydetails();
    }
}
