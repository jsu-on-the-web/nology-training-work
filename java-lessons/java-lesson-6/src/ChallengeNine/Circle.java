public class Circle implements IArea, IPerimeter {
    float radius;

    public Circle(float radius) {
        setRadius(radius);
    }

    @Override 
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
        return "Circle with radius " + getRadius() + " has area " + getArea() + " and perimeter " + getPerimeter();
    }
}
