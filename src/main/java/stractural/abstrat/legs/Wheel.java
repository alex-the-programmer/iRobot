package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;

public abstract class Wheel extends Part {
    public Wheel(Point3D initialPosition) {
        super(initialPosition);
    }

    protected Node setShape() {
        return new Cylinder(20, 20);
    }

    abstract void roll(int distance, MovingDirection direction);

    abstract void setTurnAngle(int angle, TurningDirection direction);
}
