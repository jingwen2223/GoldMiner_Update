import java.awt.Graphics;
import java.awt.Image;

public class Object {
	int x;
	int y;
	
	
	int width= (int) (Math.random()*2+25);;;
	int height= (int) (Math.random()*2+20);;;
	
	Image img;
	boolean flag; // can be moved?
	
	void paintSelf(Graphics g) {
		//	g.drawImage(img, x, y, null);
		
			g.drawImage(img, x,y, width,height , null); //(0,0) center
		

	}
	
}
