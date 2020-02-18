package stractural.abstrat.legs;

import lombok.AllArgsConstructor;
import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;

@AllArgsConstructor
public abstract class Foot implements Part {
    protected FootSection rearFootSection;
    protected Expandable expander;
    protected FootSection frontFootSection;

    void roll(int distance, MovingDirection direction){
        rearFootSection.roll(distance, direction);
        frontFootSection.roll(distance, direction);
    }
}
