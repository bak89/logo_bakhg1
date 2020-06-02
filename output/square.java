import java.awt.Graphics;

public class square extends java.applet.Applet {

   private LogoPrimitives logo;

   private void poly(double SIDES, double SIZE){
      for(int i = 0; i <= SIDES; i++){
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
