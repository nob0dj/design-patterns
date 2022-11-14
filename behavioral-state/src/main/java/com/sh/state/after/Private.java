package com.sh.state.after;

public class Private implements State{
    private final OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addStudent(Student student) {
        if(student.isAvailable(this.onlineCourse)){
            this.onlineCourse.getStudents().add(student);
        }
        else
            throw new UnsupportedOperationException("Private 코스에 등록된 수강생만 추가가능합니다. 먼저 학생을 Private 코스에 등록하세요.");
    }

    @Override
    public void addReview(String review, Student student) {
        if(this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        }
        else
            throw new UnsupportedOperationException("Private코스 수강생만 리뷰를 남길수 있습니다.");
    }
}
