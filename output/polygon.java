import java.awt.Graphics;

public class polygon extends java.applet.Applet {

   private LogoPrimitives logo;

   private void poly(double SIDES){
      for(int i = 0; i <= SIDES; i++){
         logo.fd(50);
         logo.rt(360/SIDES);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      poly(5);
   }
}
