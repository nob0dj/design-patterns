package com.sh.visitor.before.shape;

import com.sh.visitor.before.device.Device;
import com.sh.visitor.before.device.Phone;
import com.sh.visitor.before.device.Watch;

public class Circle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Circle to phone");
        } else if (device instanceof Watch) {
            System.out.println("print Circle to watch");
        }
    }
}
