package com.sh.visitor.after.shape;

import com.sh.visitor.after.device.Device;
import com.sh.visitor.after.device.Phone;
import com.sh.visitor.after.device.Watch;

public class Triangle implements Shape {

    @Override
    public void printTo(Device device) {
        device.accept(this);
    }

}
