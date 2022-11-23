package com.sh.visitor.after.device;

import com.sh.visitor.after.shape.Circle;
import com.sh.visitor.after.shape.Rectangle;
import com.sh.visitor.after.shape.Triangle;

public class Phone implements Device {
    @Override
    public void accept(Triangle triangle) {
        System.out.println("print Triangle to Watch");
    }

    @Override
    public void accept(Rectangle rectangle) {
        System.out.println("print Rectangle to Watch");
    }

    @Override
    public void accept(Circle circle) {
        System.out.println("print Circle to Watch");
    }
}
