package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Box;
import javafx.scene.shape.Shape3D;
import lombok.val;
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

    protected Node setShape() {
        val foot = new Group();

        foot.getChildren().add(rearFootSection.getShape());
        foot.getChildren().add(expander.getShape());
        foot.getChildren().add(frontFootSection.getShape());

        return foot;
    }

    void roll(int distance, MovingDirection direction){
        rearFootSection.roll(distance, direction);
        frontFootSection.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        frontFootSection.setTurnAngle(angle, direction);
    }
}
