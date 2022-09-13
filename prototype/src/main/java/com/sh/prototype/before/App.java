package com.sh.prototype.before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("nob0dj");
        repository.setName("design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: Prototype패턴이란");

        String url = githubIssue.getUrl();
        System.out.println(url);
    }

}
