import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class background {
	Image background =Toolkit.getDefaultToolkit().getImage("imgs/bg.jpg");
	

	
	void paintSelf(Graphics g) {
	g.drawImage(background, 0,0, 700,900 , null); //(0,0) center
	//g.drawImage(goldnuget, 0,50, 768,180 , null); //draw back ground
	//g.drawImage(robot,0,20,500,100,null);
	//g.drawImage(background,0, 0, null);
	
		
	//drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
	}
	
	
	
	
	
	
}
