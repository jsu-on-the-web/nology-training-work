package inheritance;

public class MyChildClass extends MyParentClass {
    public MyChildClass(float newFloat) {
        super(newFloat);
        System.out.println("Child Class");
    }

    public void childMethod() {
        System.out.println("Child Method");
    }
}
