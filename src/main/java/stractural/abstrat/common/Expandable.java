package stractural.abstrat.common;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;

public abstract class Expandable extends Part {
    public Node setShape() {
        return new Cylinder(10, 50);
    }

    public abstract void extendBy(int distance);

    public abstract void collapseBy(int distance);

    public abstract void setTo(int extendedLength);
}
