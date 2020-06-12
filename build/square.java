import java.awt.Graphics;

public class square extends java.applet.Applet {

   private LogoPrimitives logo;

   private void poly(double SIDES, double SIZE){
      for(int i1 = 0; i1 <= SIDES; i1++){
         logo.fd(SIZE);
         logo.lt(360/SIDES);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      poly(4, 100);
      logo.st();
   }
}
