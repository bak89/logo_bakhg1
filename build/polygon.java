import java.awt.Graphics;

public class polygon extends java.applet.Applet {

   private LogoPrimitives logo;

   private void poly(double SIDES){
      for(int i1 = 0; i1 <= SIDES; i1++){
         logo.fd(50);
         logo.rt(360/SIDES);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      poly(5);
   }
}
