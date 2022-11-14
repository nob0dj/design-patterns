package com.sh.state.after;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private State state = new Draft(this);
    private List<Student> students = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public void addStudent(Student student){
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student){
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "state=" + state +
                ", students=" + students +
                ", reviews=" + reviews +
                '}';
    }

    public <T> void changeState(Class<T> clz) {
        try {
            Constructor<T> constructor = clz.getConstructor(this.getClass());
            this.state = (State) constructor.newInstance(this);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
