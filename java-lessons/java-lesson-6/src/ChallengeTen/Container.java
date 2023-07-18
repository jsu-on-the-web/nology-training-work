package src.ChallengeTen;

public abstract class Container {
    abstract public int getVolume();

    public int teaspoonCount() {
        // One teaspoon of coffee for each 150ml of water
        return Math.round(getVolume() / 150f);
    }

    public String getInfo() {
        return "Container with volume " + getVolume() + " ml. It takes " + teaspoonCount() + " full teaspoon/s of coffee granules to fill it with coffee.";
    }
}
