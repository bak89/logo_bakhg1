import java.awt.Graphics;

public class demo extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i1 = 0; i1 < 3; i1++){
         logo.fd(100);
         logo.rt(120);
         logo.wait(750);
      }
      logo.wait(1500);
      logo.cs();
      for(int i1 = 0; i1 < 100; i1++){
         for(int i2 = 0; i2 < 3; i2++){
            logo.fd(100);
            logo.rt(120);
            logo.wait(2);
         }
         logo.rt(10);
      }
      logo.wait(1000);
      logo.cs();
      for(int i1 = 0; i1 < 1800; i1++){
         logo.fd(10);
         logo.rt(i1+0.1);
         logo.wait(1);
      }
      logo.wait(1000);
      logo.cs();
      for(int i1 = 0; i1 < 3600; i1++){
         logo.fd(10);
         logo.rt(i1+0.2);
      }
      logo.wait(2000);
      logo.cs();
      for(int i1 = 0; i1 < 8; i1++){
         logo.rt(45);
         for(int i2 = 0; i2 < 6; i2++){
            for(int i3 = 0; i3 < 90; i3++){
               logo.fd(2);
               logo.rt(2);
               logo.wait(1);
            }
            logo.rt(90);
         }
      }
      logo.wait(2000);
      logo.cs();
      for(int i1 = 0; i1 < 40; i1++){
         for(int i2 = 0; i2 < 34; i2++){
            logo.fd(12);
            logo.rt(10);
            logo.wait(1);
         }
         logo.rt(90);
      }
   }
}
