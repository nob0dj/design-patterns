package com.sh.prototype.after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("nob0dj");
        repository.setName("design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: Prototype패턴이란");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // 복제 githubIssue객체를 prototype삼아서 동일한 내용을 가진 객체를 생성
        GithubIssue cloned = githubIssue.clone(); // throws CloneNotSupportedException

        System.out.println(cloned.getUrl());
        System.out.println(githubIssue != cloned); // true;
        System.out.println(githubIssue.getClass() == cloned.getClass()); // true
        System.out.println(githubIssue.equals(cloned)); // true : equals/hashCode override후

        // shallow copy 확인
        githubIssue.getRepository().setUser("shqkel");
        System.out.println(cloned.getRepository().getUser()); // shqkel -> deep copy후에는 nob0dj

     }

}
