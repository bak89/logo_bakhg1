import java.awt.Graphics;

public class simple extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.fd(100);
      logo.rt(90);
      logo.fd(100);
      logo.rt(90);
      logo.fd(100);
      logo.rt(90);
      logo.fd(100);
      logo.rt(90);
   }
}
