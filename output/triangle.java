import java.awt.Graphics;

public class triangle extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i = 0; i <= 3; i++){
         logo.fd(100);
         logo.rt(120);
      }
   }
}
