public class Sphere implements IVolume, ISurfaceArea {
    public float radius;

    public Sphere(float radius) {
        setRadius(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        } else {
            this.radius = radius;
        }
    }

    public String getInfo() {
        return "Sphere with radius " + getRadius() + " has volume " + getVolume() + " and surface area " + getSurfaceArea();
    }
}
