public class ChallengeNineMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getInfo());
        Triangle triangle = new Triangle(5, 6);
        System.out.println(triangle.getInfo());
        Rhombus rhombus = new Rhombus(5, 6, 7);
        System.out.println(rhombus.getInfo());

        Cube cube = new Cube(5);
        System.out.println(cube.getInfo());
        Sphere sphere = new Sphere(5);
        System.out.println(sphere.getInfo());
    }
}
