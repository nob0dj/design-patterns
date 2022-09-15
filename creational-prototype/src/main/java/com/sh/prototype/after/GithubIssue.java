package com.sh.prototype.after;

import java.util.Objects;

/**
 * <pre>
 * GithubIssue객체를 clone하기 위해서는
 * - implements Cloneable
 * - Object#clone overriding
 * </pre>
 */
public class GithubIssue implements Cloneable{

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    /**
     * super.clone()은 shallow copy처리
     *
     * - x.clone() != x : true
     * - x.clone().getClass() == x.getClass() : true
     * - x.clone().equals(x) : 필수는 아님. equals/hashcode override했다면 true
     *
     * @return GithubIssue  공변반환타입
     * @throws CloneNotSupportedException
     */
    @Override
    protected GithubIssue clone() throws CloneNotSupportedException {
//        return (GithubIssue) super.clone(); // shallow copy

        GithubRepository repository = new GithubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);
        return githubIssue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GithubIssue that = (GithubIssue) o;

        if (id != that.id) return false;
        if (!Objects.equals(title, that.title)) return false;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (repository != null ? repository.hashCode() : 0);
        return result;
    }
}
