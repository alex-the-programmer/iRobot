package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import lombok.AllArgsConstructor;
import lombok.val;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;

@AllArgsConstructor
public abstract class FootSection extends Part {
    private Wheel wheel;

    public Node setShape() {
        val footSection = new Group();
        val platform = new  Box(10, 20, 5);
        footSection.getChildren().add(platform);
        footSection.getChildren().add(wheel.getShape());
        return footSection;
    }

    void roll(int distance, MovingDirection direction){
        wheel.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        wheel.setTurnAngle(angle, direction);
    }
}
