package practice3.team;
import java.util.List;

import practice3.Skill;
import practice3.employee.Employee;
import practice3.employee.Manager;
import practice3.employee.Member;
import practice3.requirement.Artifact;
import practice3.requirement.Requirement;

public interface Team {
    boolean add(Employee employee);
    boolean remove(Employee employee);
    List<Employee> getEmployeesBySkill(Skill skill);
    List<Artifact> develop(Requirement requirement);
    List<Member> getMembers();
    List<Manager> getManagers();
}