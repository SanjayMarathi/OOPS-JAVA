class OuterClass {
    static int val = 10;

    static class InnerClass {
        public void execute() {
            System.err.println("Inner Class Executed "+ val);
        }
    }

    public void execute() {
        InnerClass innerClass = new InnerClass();
        innerClass.execute();
    }
}

public class StaticNestedClass {
    public static void main(String []args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.execute();
        OuterClass outerClass = new OuterClass();
        outerClass.execute();
    }
}
