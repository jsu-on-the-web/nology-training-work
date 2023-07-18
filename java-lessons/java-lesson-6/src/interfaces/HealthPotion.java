public class HealthPotion implements IApplyEffect {
    
    int healAmount = 20;
    @Override
    public void apply(Player player) {
        player.setHealth(player.getHealth() + healAmount);
    }
}
