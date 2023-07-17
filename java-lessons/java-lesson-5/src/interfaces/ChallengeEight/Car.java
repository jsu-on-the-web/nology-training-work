package interfaces.ChallengeEight;

public class Car implements Vehicle {
    // * This is stored in miles per h
    int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public String getSpeed() {
        double mphToMh = speed * 1609.344;
        return String.valueOf(Math.round(mphToMh)) + " m/h";
    }

    @Override
    public void decreaseSpeed(int speedReduction) {
        this.speed -= speedReduction;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative");
        } else {
            this.speed = speed;
        }
    }
}
