package practice3.team;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import practice3.Skill;
import practice3.employee.Employee;
import practice3.employee.Manager;
import practice3.employee.Member;
import practice3.requirement.Artifact;
import practice3.requirement.Requirement;
import practice3.requirement.Task;

public class BackendTeam implements Team {
    private List<Employee> employeeList = new ArrayList<>();

    @Override public boolean add(Employee employee) {
        return this.employeeList.add(employee);
    }

    @Override
    public boolean remove(Employee employee) {
        return this.employeeList.remove(employee);
    }

    @Override
    public List<Employee> getEmployeesBySkill(Skill skill) {
        return this.employeeList.stream().filter(e -> e.getSkills().contains(skill)).toList();
    }

    @Override
    public List<Artifact> develop(Requirement requirement) {
        Random random = new Random();
        int index = random.nextInt(this.getManagers().size());
        Manager manager = this.getManagers().get(index);
        Task[] tasks = manager.plan(requirement, this.getMembers().size());
        ArrayList<Artifact> artifactList = new ArrayList<>();
        for (Task task : tasks) {
            Artifact artifact = this.getMembers().stream().filter(m -> m.getSkills().contains(task.requireSkill())).findFirst().get().executeTask(task);
            artifactList.add(artifact);
        }
        if (artifactList.stream().allMatch(a -> manager.check(a))) {
            return artifactList;
        }
        return new ArrayList<>();
    }
    @Override
    public List<Manager> getManagers() {
        return this.employeeList.stream().filter(e -> e instanceof Manager).map(e -> (Manager)e).toList();
    }

    @Override
    public List<Member> getMembers() {
        return this.employeeList.stream().filter(e -> e instanceof Member).map(e -> (Member)e).toList();
    }
}