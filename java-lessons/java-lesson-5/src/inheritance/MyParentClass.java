package inheritance;
public class MyParentClass {
    float myFloat;
    private String name;

    public MyParentClass (float newFloat) {
        this.myFloat = newFloat;
    }

    public void parentMethod() {
        System.out.printf("Parent Class: %f", myFloat);
    }
}
