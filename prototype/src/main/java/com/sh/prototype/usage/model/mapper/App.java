package com.sh.prototype.usage.model.mapper;

import org.modelmapper.ModelMapper;

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

        // GithubIssueData타입 필드값 매핑을 model mapper의존을 통해 처리 (내부적으로 reflection 사용)
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData); // GithubIssueData{id=1, title='1주차 과제: Prototype패턴이란', repositoryUser='nob0dj', repositoryName='design-patterns'}


    }

}
