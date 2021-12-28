import java.awt.Toolkit;

public class Skull extends Gold{
		Skull(){
			this.x=(int)(Math.random()*650);  //700
			this.y=(int)(Math.random()*450+410); //900
			this.width=56;
			this.height=56;
			this.m=100;
			this.img=Toolkit.getDefaultToolkit().getImage("imgs/Skull.png");
		}
}
