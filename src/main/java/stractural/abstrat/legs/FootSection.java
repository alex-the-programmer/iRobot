package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;

public abstract class FootSection extends Part {
    private Wheel wheel;

    public FootSection(Point3D initialPosition, Wheel wheel) {
        super(initialPosition);
        this.wheel = wheel;
    }

    protected Shape3D setShape() {
        return new Box(10, 20, 5);
    }

    void roll(int distance, MovingDirection direction){
        wheel.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        wheel.setTurnAngle(angle, direction);
    }
}
