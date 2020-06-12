import java.awt.Graphics;

public class factor extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.fd(1+2);
      logo.fd(1*1);
      logo.fd(1-1);
      logo.fd(1/1);
   }
}
