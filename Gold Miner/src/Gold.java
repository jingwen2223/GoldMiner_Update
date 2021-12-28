import java.awt.Toolkit;

public class Gold extends Object{
	
	

	Gold(){
		this.x=(int)(Math.random()*650);  //700
		this.y=(int)(Math.random()*300+500); //900
		this.width=(int)(Math.random()*10+50);
		this.height=(int)(Math.random()*13+50);
		this.flag=false;
		this.m=100;
		this.img = Toolkit.getDefaultToolkit().getImage("imgs/Gold_Ingots.png");
	

		
	
}
}

 