public class Player {
    public String name;
    public int health;
    public final int max = 100;

    public Player() {
        this.name = "Player";
        this.health = this.max;
    }

    public Player(String name) {
        this.name = name;
        this.health = this.max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Player";
        } else {
            this.name = name;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (this.health > this.max) {
            this.health = this.max;
        } else if (this.health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }
}
