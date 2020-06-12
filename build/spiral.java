import java.awt.Graphics;

public class spiral extends java.applet.Applet {

   private LogoPrimitives logo;

   private void spiral(double TIMES, double ANGLE){
      for(int i1 = 0; i1 <= TIMES; i1++){
         logo.fd(TIMES-i1+1);
         logo.rt(ANGLE);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.lt(90);
      logo.fd(200);
      logo.rt(90);
      logo.pd();
      spiral(70, 18);
   }
}
