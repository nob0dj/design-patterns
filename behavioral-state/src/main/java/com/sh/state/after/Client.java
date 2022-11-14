package com.sh.state.after;

public class Client {
    public static void main(String[] args) {

        Client client = new Client();
//        client.testStatusDraft();
//        client.testStatusPrivate();
        client.testStatusPublished();

    }

    private void testStatusPublished() {
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(Published.class);

        Student honggd = new Student("honggd");
        onlineCourse.addStudent(honggd);

        Student sinsa = new Student("sinsa");
        onlineCourse.addStudent(sinsa);

        onlineCourse.addReview("hello", honggd);
        onlineCourse.addReview("byebye", sinsa);

        System.out.println(onlineCourse); // OnlineCourse{state=com.sh.state.after.Published@42d3bd8b, students=[Student{name='honggd'}, Student{name='sinsa'}], reviews=[hello, byebye]}
    }

    private void testStatusPrivate() {
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(Private.class);

        Student honggd = new Student("honggd");
//        onlineCourse.addStudent(honggd); // UnsupportedOperationException: Private 코스에 등록된 수강생만 추가가능합니다. 먼저 학생을 Private 코스에 등록하세요.

        Student sinsa = new Student("sinsa");
        sinsa.addPrivateCourse(onlineCourse);
        onlineCourse.addStudent(sinsa);

//        onlineCourse.addReview("hello", honggd); // UnsupportedOperationException: Private코스 수강생만 리뷰를 남길수 있습니다.
        onlineCourse.addReview("byebye", sinsa);

        System.out.println(onlineCourse); // OnlineCourse{state=com.sh.state.after.Private@5f2050f6, students=[Student{name='sinsa'}], reviews=[byebye]}
    }

    private void testStatusDraft() {

        OnlineCourse onlineCourse = new OnlineCourse();
        Student honggd = new Student("honggd");

        onlineCourse.addStudent(honggd);
//        onlineCourse.addReview("hello", honggd); // UnsupportedOperationException: Drift상태에서는 리뷰를 남길수 없습니다.

        System.out.println(onlineCourse); // OnlineCourse{state=com.sh.state.after.Draft@dfd3711, students=[Student{name='honggd'}], reviews=[]}

    }
}
