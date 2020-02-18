package stractural.abstrat.legs;

import javafx.geometry.Point3D;
import stractural.abstrat.common.*;

public abstract class Leg extends Part {
    private Bearing topBearing;
    private stractural.abstrat.common.Pipe pipe;
    private Bearing bottomBearing;
    private Foot foot;

    public Leg(Point3D initialPosition, Bearing topBearing, Pipe pipe, Bearing bottomBearing, Foot foot) {
        super(initialPosition);
        this.topBearing = topBearing;
        this.pipe = pipe;
        this.bottomBearing = bottomBearing;
        this.foot = foot;
    }

    public void roll(int distance, MovingDirection direction){
        foot.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        foot.setTurnAngle(angle, direction);
    }
}
