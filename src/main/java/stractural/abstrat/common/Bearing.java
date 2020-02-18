package stractural.abstrat.common;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.shape.Sphere;

public class Bearing extends Part {
    Bearing(Point3D initialPosition) {
        super(initialPosition);
    }

    protected Node setShape() {
        return new Sphere(12);
    }
}
