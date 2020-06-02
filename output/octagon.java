import java.awt.Graphics;

public class octagon extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i = 0; i <= 8; i++){
         logo.fd(100);
         logo.rt(45);
      }
   }
}
