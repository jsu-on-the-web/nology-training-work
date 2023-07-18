public class Triangle implements IArea, IPerimeter {
    float base;
    float height;

    public Triangle(float base, float height) {
        setBase(base);
        setHeight(height);
    }
    
    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return base + height + height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if (base < 0) {
            throw new IllegalArgumentException("Base cannot be negative");
        } else {
            this.base = base;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        } else {
            this.height = height;
        }
    }

    public String getInfo() {
        return "Triangle with base " + getBase() + " and height " + getHeight() + " has area " + getArea() + " and perimeter " + getPerimeter();
    }

}
