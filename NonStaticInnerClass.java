class OuterClass {
    static int val = 10;
    String name = "Outer Class";

    class InnerClass {
        public void execute() {
            System.out.println("Inner Class Executed " + name);
            System.out.println("Inner Class Executed " + val);
        }
    }
}
public class NonStaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass(). new InnerClass();
        innerClass.execute();
    }
}
