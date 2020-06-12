import java.awt.Graphics;

public class triangle extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i1 = 0; i1 <= 3; i1++){
         logo.fd(100);
         logo.rt(120);
      }
   }
}
