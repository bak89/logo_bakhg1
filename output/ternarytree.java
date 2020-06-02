import java.awt.Graphics;

public class ternarytree extends java.applet.Applet {

   private LogoPrimitives logo;

   private void tree(double SIZE){
      if(SIZE>=5){         logo.fd(SIZE);
         tree(SIZE*0.7);
         logo.lt(45);
         tree(SIZE*0.7);
         logo.rt(90);
         tree(SIZE*0.7);
         logo.lt(45);
         logo.bk(SIZE);
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.lt(90);
      logo.pu();
      logo.bk(200);
      logo.pd();
      tree(70);
   }
}
