package com.sh.observer.usage.java;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * deprecated Observer/Observable 대신 사용
 */
public class PropertyChangeExample {

    /**
     * Concrete Observer
     */
    static class User implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println("[" + evt.getPropertyName() + "] " + evt.getNewValue());
        }
    }

    static class Subject {
        PropertyChangeSupport support = new PropertyChangeSupport(this);

        public void addObserver(PropertyChangeListener observer) {
            support.addPropertyChangeListener(observer);
        }
        public void addObserver(String propertyName, PropertyChangeListener observer) {
            support.addPropertyChangeListener(propertyName, observer);
        }

        public void removeObserver(PropertyChangeListener observer) {
            support.removePropertyChangeListener(observer);
        }
        public void removeObserver(String propertyName, PropertyChangeListener observer) {
            support.removePropertyChangeListener(propertyName, observer);
        }

        public void add(String message) {
            support.firePropertyChange("eventName", null, message);
        }
        public void add(String propertyName, String message) {
            support.firePropertyChange(propertyName, null, message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User observer = new User();
        subject.addObserver("java", observer);
        subject.add("java", "자바 PCL 예제 코드"); // User에서 메세지 확인
        subject.add("추석", "전통에 따라 차례/제사는 남자가 준비해야...."); // 구독하지 않았으므로 메세지 확인 안됨.
        subject.add("Helloworld");
        subject.removeObserver(observer);
        subject.add("이 메시지는 볼 수 없지..");
    }

}
