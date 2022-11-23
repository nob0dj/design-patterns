package com.sh.visitor.after;

import com.sh.visitor.after.device.Device;
import com.sh.visitor.after.device.Phone;
import com.sh.visitor.after.shape.Rectangle;
import com.sh.visitor.after.shape.Shape;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();
        rectangle.printTo(device);
    }
}
