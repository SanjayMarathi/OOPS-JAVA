class OuterClass {
    static int val = 10;
    String name = "Outer class";

    public void execute() {
        class InnerClass {
            public void execute() {
                System.out.println("The Inner Class Is executed.");
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.execute();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.execute();
    }
}
