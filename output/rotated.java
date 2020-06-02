import java.awt.Graphics;

public class rotated extends java.applet.Applet {

   private LogoPrimitives logo;

   private void rotate(double ANGLE, double TIMES){
      for(int i = 0; i <= TIMES; i++){
         logo.fd(200);
         logo.rt(ANGLE);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.rt(180);
      logo.fd(100);
      logo.rt(90);
      logo.fd(20);
      logo.rt(90);
      logo.pd();
      rotate(155, 360/5);
   }
}
