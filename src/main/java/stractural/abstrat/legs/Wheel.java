package stractural.abstrat.legs;

import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;

public interface Wheel extends Part {
    void roll(int distance, MovingDirection direction);

    void setTurnAngle(int angle, TurningDirection direction);
}
