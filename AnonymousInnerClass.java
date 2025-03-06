interface  Sample {
    public void execute();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Sample sample = new Sample() {
            public void execute() {
                System.out.println("Yes I did run");
            }
        };
        sample.execute();
    }
}
