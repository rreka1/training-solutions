package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
        this.hitPoint = 100;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(9) + 1;
    }

    private int getActualDefence() {
        return random.nextInt(5);
    }

    protected void hit(Character enemy, int damage) {
        int actualDefence = enemy.getActualDefence();
        if (actualDefence < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        this.hitPoint -= diff;
    }

    public abstract void secondaryAttack(Character enemy);
}
