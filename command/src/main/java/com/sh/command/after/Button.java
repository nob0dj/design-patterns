package com.sh.command.after;

import java.util.Stack;

/**
 * invoker
 * - Button은 Light(receiver)에 대해 모른다.
 * - receiver/command가 변경 될때 Button은 변경되지 않는다. (OCP)
 */
public class Button {

    private Stack<Command> commandStack = new Stack<>();

    public void press(Command command){
        commandStack.push(command);
        command.execute();
    }

    public void undo(){
       if(!commandStack.isEmpty()){
           Command lastCommand = commandStack.pop();
           lastCommand.undo();
       }
    }

    public static void main(String[] args) {
        Button button = new Button();
        Light light = new Light();
        button.press(new LightOnCommand(light));
        button.press(new LightOffCommand(light));
        button.undo();
        button.undo();
    }
}
