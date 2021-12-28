import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Object {
	int x;
	int y;
	
	
	int width= 75;
	int height= 75;
	
	Image img;
	boolean flag; // can be moved?
	int m;
	
	void paintSelf(Graphics g) {
		//	g.drawImage(img, x, y, null);
		
			g.drawImage(img, x,y, width,height , null); //(0,0) center

	}
	public int getWidth() {
		return width;
	}
	
	public Rectangle getRec() {
		return new Rectangle(x,y,width,height);
	}
	
	
}
