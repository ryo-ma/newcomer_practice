package practice3.employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import practice3.Skill;
import practice3.requirement.Artifact;
import practice3.requirement.Task;

public class Member implements Employee {
    private String name;
    private List<Skill> skills;

    public Member(String name, Skill[] skills) {
        this.name = name;
        this.skills = Arrays.asList(skills);
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Skill> getSkills() {
        return new ArrayList<>(this.skills);
    }

    public Artifact executeTask(Task task) {
        if (this.getSkills().contains(task.requireSkill())) {
            return new Artifact(task.title(), "artifact", this.name, true);
        }
        return new Artifact(task.title(), "", this.name, false);
    }
}