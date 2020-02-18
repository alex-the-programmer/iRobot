package stractural.abstrat.legs;

import lombok.AllArgsConstructor;
import stractural.abstrat.common.*;

@AllArgsConstructor
public abstract class Leg implements Part {
    protected Bearing topBearing;
    protected stractural.abstrat.common.Pipe pipe;
    protected Bearing bottomBearing;
    protected Foot foot;

    public void roll(int distance, MovingDirection direction){
        foot.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        foot.setTurnAngle(angle, direction);
    }
}
