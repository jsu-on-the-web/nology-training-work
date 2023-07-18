public class Cube implements IVolume, ISurfaceArea {
    float side;
    
    public Cube(float side) {
        setSide(side);
    }
    
    @Override
    public double getVolume() {
        return side * side * side;
    }
    
    @Override
    public double getSurfaceArea() {
        return 6 * side * side;
    }
    
    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side cannot be negative");
        } else {
            this.side = side;
        }
    }

    public String getInfo() {
        return "Cube with side length " + getSide() + " has volume " + getVolume() + " and surface area " + getSurfaceArea();
    }
    
}
