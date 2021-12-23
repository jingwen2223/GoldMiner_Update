import java.awt.Toolkit;

public class Gold extends Object{
	
	

	Gold(){
		this.x=(int)(Math.random()*650);  //700
		this.y=(int)(Math.random()*350+400); //900
		this.width=(int)(Math.random()*10+40);
		this.height=(int)(Math.random()*13+50);
		

		this.img = Toolkit.getDefaultToolkit().getImage("imgs/goldnuget.png");
		this.flag=false;
	}
}
