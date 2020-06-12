import java.awt.Graphics;

public class snowflake extends java.applet.Applet {

   private LogoPrimitives logo;

   private void divside(double L, double S){
      if(L==1){         logo.fd(S);
      }
      else{
         divside(L-1, S/3);
         logo.lt(60);
         divside(L-1, S/3);
         logo.rt(120);
         divside(L-1, S/3);
         logo.lt(60);
         divside(L-1, S/3);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.rt(180);
      logo.fd(150);
      logo.rt(90);
      logo.fd(85);
      logo.rt(90);
      logo.pd();
      for(int i1 = 0; i1 <= 3; i1++){
         divside(5, 300);
         logo.rt(120);
      }
   }
}
