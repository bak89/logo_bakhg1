import java.awt.Graphics;

public class pentagon extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i = 0; i <= 5; i++){         logo.fd(100);
         logo.rt(72);
      }
   }
}
