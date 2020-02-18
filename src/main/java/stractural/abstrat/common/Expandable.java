package stractural.abstrat.common;

import javafx.geometry.Point3D;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;

public abstract class Expandable extends Part {
    public Expandable(Point3D initialPosition) {
        super(initialPosition);
    }

    protected Shape3D setShape() {
        return new Cylinder(10, 50);
    }

    abstract void extendBy(int distance);

    abstract void collapseBy(int distance);

    abstract void setTo(int extendedLength);
}
