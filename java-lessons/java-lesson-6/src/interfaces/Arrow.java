public class Arrow implements IApplyEffect {
    int damageAmount = 5;
    @Override
    public void apply(Player player) {
        player.setHealth(player.getHealth() - damageAmount);
    }
}
