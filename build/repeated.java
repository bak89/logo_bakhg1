import java.awt.Graphics;

public class repeated extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i1 = 0; i1 <= 4; i1++){
         for(int i2 = 0; i2 <= 4; i2++){
            logo.fd(i2*25);
            logo.rt(90);
         }
         logo.rt(45*i1);
      }
      logo.wait(1000);
      logo.cs();
      for(int i1 = 0; i1 <= 1; i1++){
         logo.fd(100*i1);
      }
      logo.wait(1000);
      logo.cs();
      for(int i1 = 0; i1 <= 0; i1++){
         logo.fd(100*i1);
      }
   }
}
