package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        boolean bothAlive = attacker.isAlive() && defender.isAlive();
        if (bothAlive) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return bothAlive;
    }

    public Character fight(Character one, Character other) {
        while (oneHit(one, other) && oneHit(other, one)) {
            round++;
        }
        return one.isAlive() ? one : other;
    }
}
