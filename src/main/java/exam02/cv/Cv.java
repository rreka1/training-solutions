package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    /*public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }*/

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... skills) {
        for (String skill : skills) {
            String skillName = skill.substring(0, skill.indexOf("(") - 1);
            int skillLevel = Integer.parseInt(skill.substring(skill.indexOf("(") + 1, skill.indexOf(")")));
            this.skills.add(new Skill(skillName, skillLevel));
        }
    }

    public int findSkillLevelByName(String s) {
        for (Skill skill : skills) {
            if (skill.getName().equals(s)) {
                return skill.getLevel();
            }
        }
        throw new SkillNotFoundException("Skill " + s + " not found!");
    }
}
