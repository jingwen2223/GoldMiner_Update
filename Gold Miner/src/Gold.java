import java.awt.Toolkit;

public class Gold extends Object{
	Gold(){
		this.x=(int)(Math.random()*700);
		this.y=(int)(Math.random()*550+300);
		this.width=5;
		this.height=5;
		this.img = Toolkit.getDefaultToolkit().getImage("imgs/goldnuget.png");
	}
}
