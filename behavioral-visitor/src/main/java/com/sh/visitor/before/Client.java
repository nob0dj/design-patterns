package com.sh.visitor.before;

import com.sh.visitor.before.device.Device;
import com.sh.visitor.before.device.Phone;
import com.sh.visitor.before.shape.Rectangle;
import com.sh.visitor.before.shape.Shape;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();
        rectangle.printTo(device);
    }
}
