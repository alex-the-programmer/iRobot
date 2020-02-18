package stractural.abstrat.common;

import Space.Space;
import javafx.geometry.Point3D;
import javafx.scene.shape.Shape;

public abstract class Part {
    protected Shape shape;

    Part(Point3D initialPosition) {
        this.shape = setShape();
        Space.getInstance().addShape(this.shape, initialPosition);
    }

    protected abstract Shape setShape();
}
