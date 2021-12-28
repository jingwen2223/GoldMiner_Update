import java.awt.Toolkit;

public class Diamond extends Gold{
		Diamond(){
			this.x=(int)(Math.random()*650);  //700
			this.y=(int)(Math.random()*450+430); //900
			this.width=30;
			this.height=30;
			
			this.m=20;
			this.img=Toolkit.getDefaultToolkit().getImage("imgs/Crystal5_Damaged.png");
		}
}
