package stractural.abstrat;

import lombok.AllArgsConstructor;
import stractural.abstrat.arms.Arm;
import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;
import stractural.abstrat.legs.Leg;

@AllArgsConstructor
public abstract class Robot implements Part {
   protected TopBox topBox;
   protected Expandable leftTopBoxExpandable;
   protected Expandable rightTopBoxExpandable;
   protected Leg leftLeg;
   protected Leg rightLeg;

   public void move(int distance, MovingDirection direction){
      leftLeg.roll(distance, direction);
      leftLeg.roll(distance, direction);
   }

   public void setTurnAngle(int angle, TurningDirection direction){
      leftLeg.setTurnAngle(angle, direction);
      rightLeg.setTurnAngle(angle, direction);
   }

   public void raiseTopBy(int distance){
      leftTopBoxExpandable.extendBy(distance);
      rightTopBoxExpandable.extendBy(distance);
   }

   public void collapseTopBy(int distance){
      leftTopBoxExpandable.collapseBy(distance);
      rightTopBoxExpandable.collapseBy(distance);
   }

   public void setTopTo(int extendedLength){
      leftTopBoxExpandable.setTo(extendedLength);
      rightTopBoxExpandable.setTo(extendedLength);
   }
}
