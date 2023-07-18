public class Rhombus implements IArea, IPerimeter {
    float sideLength;
    float diagonalOne;
    float diagonalTwo;
    
    public Rhombus(float sideLength, float diagonalOne, float diagonalTwo) {
        setSideLength(sideLength);
        setDiagonalOne(diagonalOne);
        setDiagonalTwo(diagonalTwo);
    }

    @Override
    public double getArea() {
        return (diagonalOne * diagonalTwo) / 2;
    }

    @Override
    public double getPerimeter() {  
        return sideLength * 4;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        if (sideLength < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        } else {
            this.sideLength = sideLength;
        }
    }


    // These could probably be condensed into one diagonal setter but do it later
    public float getDiagonalOne() {
        return diagonalOne;
    }

    public void setDiagonalOne(float diagonalOne) {
        if (diagonalOne < 0) {
            throw new IllegalArgumentException("Diagonal one cannot be negative");
        } else {
            this.diagonalOne = diagonalOne;
        }
    }

    public float getDiagonalTwo() {
        return diagonalTwo;
    }

    public void setDiagonalTwo(float diagonalTwo) {
        if (diagonalTwo < 0) {
            throw new IllegalArgumentException("Diagonal two cannot be negative");
        } else {
            this.diagonalTwo = diagonalTwo;
        }
    }

    public String getInfo() {
        return "Rhombus with side length " + getSideLength() + " and the diagonals " + getDiagonalOne() + " and " + getDiagonalTwo() + " has area " + getArea() + " and perimeter " + getPerimeter();
    }
}
