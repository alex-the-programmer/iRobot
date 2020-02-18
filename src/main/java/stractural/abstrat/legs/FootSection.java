package stractural.abstrat.legs;

import lombok.AllArgsConstructor;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;

@AllArgsConstructor
public abstract class FootSection implements Part {
    private Wheel wheel;

    void roll(int distance, MovingDirection direction){
        wheel.roll(distance, direction);
    }

    public void setTurnAngle(int angle, TurningDirection direction) {
        wheel.setTurnAngle(angle, direction);
    }
}
