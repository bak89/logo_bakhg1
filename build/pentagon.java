import java.awt.Graphics;

public class pentagon extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i1 = 0; i1 <= 5; i1++){
         logo.fd(100);
         logo.rt(72);
      }
   }
}
