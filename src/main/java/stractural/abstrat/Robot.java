package stractural.abstrat;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import lombok.AllArgsConstructor;
import lombok.val;
import stractural.abstrat.common.Expandable;
import stractural.abstrat.common.MovingDirection;
import stractural.abstrat.common.Part;
import stractural.abstrat.common.TurningDirection;
import stractural.abstrat.legs.Leg;

@AllArgsConstructor
public class Robot extends Part {
   private TopBox topBox;
   private Expandable leftTopBoxExpandable;
   private Expandable rightTopBoxExpandable;
   private Leg leftLeg;
   private Leg rightLeg;

   protected Node setShape() {
      val robot = new Group();

      robot.getChildren().add(topBox.getShape());
      robot.getChildren().add(leftTopBoxExpandable.getShape());
      robot.getChildren().add(rightTopBoxExpandable.getShape());
      robot.getChildren().add(leftLeg.getShape());
      robot.getChildren().add(rightLeg.getShape());

      return robot;
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
