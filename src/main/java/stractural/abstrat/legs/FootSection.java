package stractural.abstrat.legs;

import lombok.AllArgsConstructor;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;

@AllArgsConstructor
public abstract class FootSection implements Part {
    private Wheel wheel;

    void roll(int distance, MovingDirection direction){
        wheel.roll(distance, direction);
    }
}
