package stractural.abstrat.common;

import javafx.geometry.Point3D;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;

public class Pipe extends Part {

    Pipe(Point3D initialPosition) {
        super(initialPosition);
    }

    protected Shape3D setShape() {
        return new Cylinder(10, 200);
    }
}
