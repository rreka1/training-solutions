package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage() {
        return (int) (Math.random() * 2 * getActualPrimaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (enemy.getPosition().distance(this.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
