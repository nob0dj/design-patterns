package com.sh.state.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
//        client.testStatusDraft();
//        client.testStatusPrivate();
        client.testStatusPublished();



        if(true) return;
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student keesun = new Student("keesun");
        keesun.addPrivateCourse(onlineCourse); // keesun을 해당 코스에 등록할 수 있도록 허가함(허가만)

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(keesun); // keesun을 해당 코스에 등록

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }

    /**
     * DRAFT
     * - 학생등록가능
     * - 리뷰불가
     */
    public void testStatusDraft(){
        OnlineCourse onlineCourse = new OnlineCourse();
        Student honggd = new Student("honggd");
        onlineCourse.addStudent(honggd);

//        onlineCourse.addReview("hello", honggd); // UnsupportedOperationException: 리뷰를 작성할 수 없습니다.

        System.out.println(onlineCourse.getState()); // DRAFT
        System.out.println(onlineCourse.getStudents()); // [Student{name='honggd'}]
        System.out.println(onlineCourse.getReviews()); // []
    }

    /**
     * PRIVATE
     * - PRIVATE상태에서는 해당과정에 등록된 학생만 등록가능
     * - review는 등록된 학생만 가능
     */
    public void testStatusPrivate () {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student honggd = new Student("honggd");
        onlineCourse.addStudent(honggd);

        onlineCourse.changeState(OnlineCourse.State.PRIVATE);
        Student sinsa = new Student("sinsa");
        sinsa.addPrivateCourse(onlineCourse);
//        onlineCourse.addStudent(honggd); // UnsupportedOperationException: 등록되지 않은 학생을 PRIVATE 수업에 추가할 수 없습니다.
        onlineCourse.addStudent(sinsa);

        onlineCourse.addReview("hello", honggd);
        onlineCourse.addReview("byebye", sinsa);
//        onlineCourse.addReview("beautiful!", new Student("leess")); // UnsupportedOperationException: 리뷰를 작성할 수 없습니다.

        System.out.println(onlineCourse.getState()); // PRIVATE
        System.out.println(onlineCourse.getStudents()); // [Student{name='honggd'}, Student{name='sinsa'}]
        System.out.println(onlineCourse.getReviews()); // [hello, byebye]
    }

    public void testStatusPublished () {
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(OnlineCourse.State.PUBLISHED);
        Student honggd = new Student("honggd");
        Student sinsa = new Student("sinsa");
        onlineCourse.addStudent(honggd);
        onlineCourse.addStudent(sinsa);

        onlineCourse.addReview("hello", honggd);
        onlineCourse.addReview("byebye", sinsa);

        System.out.println(onlineCourse.getState()); // PUBLISHED
        System.out.println(onlineCourse.getStudents()); // [Student{name='honggd'}, Student{name='sinsa'}]
        System.out.println(onlineCourse.getReviews()); // [hello, byebye]
    }
}
