package stractural.abstrat.common;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;

public class Pipe extends Part {
    protected Node setShape() {
        return new Cylinder(10, 200);
    }
}
