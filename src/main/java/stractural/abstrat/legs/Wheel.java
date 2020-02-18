package stractural.abstrat.legs;

import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;

public interface Wheel extends Part {
    void roll(int distance, MovingDirection direction);
}
