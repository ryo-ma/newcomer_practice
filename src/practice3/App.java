package practice3;

import java.util.List;

import practice3.employee.Manager;
import practice3.employee.Member;
import practice3.requirement.Requirement;
import practice3.team.BackendTeam;
import practice3.team.FrontendTeam;

public class App {
    public static void main(String[] args) {
        BackendTeam backendTeam = new BackendTeam();
        FrontendTeam frontendTeam = new FrontendTeam();
        backendTeam.add(new Member("A", new Skill[]{Skill.ARCHITECT}));
        backendTeam.add(new Member("B", new Skill[]{Skill.BACKEND_DEVELOPMENT}));
        backendTeam.add(new Manager("C", new Skill[]{Skill.MANAGEMENT}));
        frontendTeam.add(new Member("D", new Skill[]{Skill.ARCHITECT}));
        frontendTeam.add(new Member("E", new Skill[]{Skill.WEB_DESIGN}));
        frontendTeam.add(new Member("F", new Skill[]{Skill.FRONTEND_DEVELOPMENT}));
        frontendTeam.add(new Manager("G", new Skill[]{Skill.MANAGEMENT}));

        Requirement frontendRequirement = new Requirement("ランディングページ作成", "イケてるランディングページを作って", "FRONTEND");
        Requirement backRequirement = new Requirement("WEB API開発", "販売管理を行うWEB APIを開発してくれ", "BACKEND");
        System.out.println("FRONTEND TEAM");
        frontendTeam.develop(frontendRequirement).forEach(a -> {
            System.out.println("title: " + a.title());
            System.out.println("body: " + a.body());
            System.out.println("auther: " + a.auther());
            System.out.println("success: " + a.isSuccess());
            System.out.println();
        });
        System.out.println("\nBACKEND TEAM");
        List<practice3.requirement.Artifact> artifacts = backendTeam.develop(backRequirement);
        artifacts.forEach(artifact -> {
            System.out.println("title: " + artifact.title());
            System.out.println("body: " + artifact.body());
            System.out.println("auther: " + artifact.auther());
            System.out.println("success: " + artifact.isSuccess());
            System.out.println();
        });
;
    }
    
}
