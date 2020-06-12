import java.awt.Graphics;

public class neg extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.rt(60);
      logo.fd(100);
      logo.rt(60);
      logo.fd(100);
      logo.rt(60);
      logo.fd(10-90);
   }
}
