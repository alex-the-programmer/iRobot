package stractural.abstrat;

import javafx.geometry.Point3D;
import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;
import stractural.abstrat.legs.Leg;

public abstract class Robot extends Part {
   private TopBox topBox;
   private Expandable leftTopBoxExpandable;
   private Expandable rightTopBoxExpandable;
   private Leg leftLeg;
   private Leg rightLeg;

   public Robot(Point3D initialPosition, TopBox topBox, Expandable leftTopBoxExpandable, Expandable rightTopBoxExpandable, Leg leftLeg, Leg rightLeg) {
      super(initialPosition);
      this.topBox = topBox;
      this.leftTopBoxExpandable = leftTopBoxExpandable;
      this.rightTopBoxExpandable = rightTopBoxExpandable;
      this.leftLeg = leftLeg;
      this.rightLeg = rightLeg;
   }

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
