import java.awt.Graphics;

public class sierpinski extends java.applet.Applet {

   private LogoPrimitives logo;

   private void triangle(double N, double LENGTH){
      if(N!=0){         for(int i1 = 0; i1 <= 3; i1++){
            triangle(N-1, LENGTH/2);
            logo.fd(LENGTH);
            logo.rt(120);
         }
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.bk(200);
      logo.rt(90);
      logo.fd(200);
      logo.lt(90);
      logo.pd();
      logo.ht();
      logo.lt(60);
      triangle(6, 400);
   }
}
