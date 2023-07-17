package interfaces.ChallengeEight;

public class Bike implements Vehicle {
    // * This is stored in miles per h
    int speed;

    public Bike(int speed) {
        this.speed = speed;
    }

    @Override
    public String getSpeed() {
        double mphToKmh = speed / 1.60934;
        return String.valueOf(Math.round(mphToKmh)) + " km/h";
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
