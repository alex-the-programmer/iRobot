package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import lombok.AllArgsConstructor;
import stractural.abstrat.common.*;

@AllArgsConstructor
public abstract class Leg extends Part {
    private Bearing topBearing;
    private stractural.abstrat.common.Pipe pipe;
    private Bearing bottomBearing;
    private Foot foot;

    public void roll(int distance, MovingDirection direction){
        foot.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        foot.setTurnAngle(angle, direction);
    }
}
