package interfaces.ChallengeEight;

public class ChallengeEightMain {
    public static void main(String[] args) {
        Bike bike = new Bike(20);
        System.out.println(bike.getSpeed());
        Car car = new Car(50);
        System.out.println(car.getSpeed());
        bike.decreaseSpeed(10);
        car.decreaseSpeed(10);
        System.out.println(bike.getSpeed());
        System.out.println(car.getSpeed());
    }
}
