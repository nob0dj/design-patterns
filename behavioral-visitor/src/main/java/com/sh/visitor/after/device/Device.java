package com.sh.visitor.after.device;

import com.sh.visitor.after.shape.Circle;
import com.sh.visitor.after.shape.Rectangle;
import com.sh.visitor.after.shape.Shape;
import com.sh.visitor.after.shape.Triangle;

public interface Device {
    void accept(Triangle triangle);

    void accept(Rectangle rectangle);

    void accept(Circle circle);
}
