package com.sh.state.after;

public class Draft implements State{

    private final OnlineCourse onlineCourse;

    public Draft(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    /**
     * Drift 상태에서는 학생 무조건 추가가능!
     * @param student
     */
    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }

    @Override
    public void addReview(String reiview, Student student) {
        throw new UnsupportedOperationException("Drift상태에서는 리뷰를 남길수 없습니다.");
    }
}
