package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;

public abstract class Foot extends Part {
    private FootSection rearFootSection;
    private Expandable expander;
    private FootSection frontFootSection;

    public Foot(Point3D initialPosition, FootSection rearFootSection, Expandable expander, FootSection frontFootSection) {
        super(initialPosition);
        this.rearFootSection = rearFootSection;
        this.expander = expander;
        this.frontFootSection = frontFootSection;
    }

    protected Shape3D setShape() {
        // elaborate the actual empty shape (pure composition)
        // perhaps groups should be used instead
        return new Box(1, 1, 1);
    }

    void roll(int distance, MovingDirection direction){
        rearFootSection.roll(distance, direction);
        frontFootSection.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        frontFootSection.setTurnAngle(angle, direction);
    }
}
