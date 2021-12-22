import java.awt.Toolkit;

public class Rock extends Object{
	Rock(){
		this.x=350;
		this.y=550;
		this.width=10;
		this.height=10;
		this.img = Toolkit.getDefaultToolkit().getImage("imgs/rocks-snow.png");
	}
}
