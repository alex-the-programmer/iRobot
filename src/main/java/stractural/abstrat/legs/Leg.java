package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import lombok.AllArgsConstructor;
import lombok.val;
import stractural.abstrat.common.*;

@AllArgsConstructor
public class Leg extends Part {
    private Bearing topBearing;
    private stractural.abstrat.common.Pipe pipe;
    private Bearing bottomBearing;
    private Foot foot;

    protected Node setShape() {
        val leg = new Group();
        leg.getChildren().add(topBearing.getShape());
        leg.getChildren().add(pipe.getShape());
        leg.getChildren().add(bottomBearing.getShape());
        leg.getChildren().add(foot.getShape());
        return leg;
    }

    public void roll(int distance, MovingDirection direction){
        foot.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        foot.setTurnAngle(angle, direction);
    }
}
