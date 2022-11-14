package com.sh.memento.after;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Memento클래스 GameSaver를 관리하는 클래스
 *
 */
public class CareTaker<T> implements Serializable {
    Stack<T> mementos = new Stack<>();

    public void push(T t){
        mementos.push(t);
    }

    public T pop(){
        return mementos.pop();
    }

    /**
     * stack은 pop할때 요소가 제거되므로, 별도의 list에 옮겨서 출력한다.
     */
    public void printMementos(){
        List<T> mementos = new ArrayList<>(this.mementos);
        for(int i = 0; i < this.mementos.size(); i++)
            System.out.println(i + " : " + mementos.get(i));
    }
}
