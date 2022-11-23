package com.sh.visitor.before.shape;

import com.sh.visitor.before.device.Device;
import com.sh.visitor.before.device.Phone;
import com.sh.visitor.before.device.Watch;

public class Triangle implements Shape {

    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Triangle to Phone");
        } else if (device instanceof Watch) {
            System.out.println("print Triangle to Watch");
        }
    }

}
