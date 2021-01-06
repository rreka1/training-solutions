package exam02.cv;

public class Skill {

    private String name;
    private int level;

    public Skill(String name, int level) {
        if (level < 1 && level > 5) {
            throw new IllegalArgumentException("Level must be between 1 and 5! " + level);
        }
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
