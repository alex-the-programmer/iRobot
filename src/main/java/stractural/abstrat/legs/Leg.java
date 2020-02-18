package stractural.abstrat.legs;

import lombok.AllArgsConstructor;
import stractural.abstrat.common.Bearing;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.Pipe;

@AllArgsConstructor
public abstract class Leg implements Part {
    protected Bearing topBearing;
    protected stractural.abstrat.common.Pipe pipe;
    protected Bearing bottomBearing;
    protected Foot foot;

    public void roll(int distance, MovingDirection direction){
        foot.roll(distance, direction);
    }
}
