package practice3.requirement;


import practice3.Skill;

public record Task(String title, String body, Skill requireSkill, boolean isFinished) {
    
}
