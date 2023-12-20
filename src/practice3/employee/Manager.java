package practice3.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import practice3.Skill;
import practice3.requirement.Artifact;
import practice3.requirement.Requirement;
import practice3.requirement.Task;

public class Manager implements Employee {
    private String name;
    private List<Skill> skills;

    public Manager(String name, Skill[] skills) {
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

    public Task[] plan(Requirement requirement, int taskNumber) {
        if (requirement.type().equals("FRONTEND")) {
            return new Task[] {
                new Task("task1", "xxx", Skill.ARCHITECT, false),
                new Task("task2", "xxxx", Skill.WEB_DESIGN, false),
                new Task("task3", "xxx", Skill.FRONTEND_DEVELOPMENT, false)};
        } else if (requirement.type().equals("BACKEND")) {
            return new Task[] {
                new Task("task1", "xxx", Skill.ARCHITECT, false),
                new Task("task2", "xxxx", Skill.BACKEND_DEVELOPMENT, false)};
        } else {
            return new Task[] {
                new Task("task3", "xxx", Skill.MANAGEMENT, false)};
        }
    }

    public boolean check(Artifact artifact) {
        return artifact.body().length() != 0;
    }
}