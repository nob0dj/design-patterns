package com.sh.command.after;

public class LightOnCommand implements Command {
    /**
     * 실행에 필요한 모든 요소를 가지고 있어야 한다.
     */
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
