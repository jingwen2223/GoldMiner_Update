import java.awt.Graphics;
import java.awt.Image;

public class Object {
	int x;
	int y;
	
	int width;
	int height;
	
	Image img;
	
	
	void paintSelf(Graphics g) {
		//	g.drawImage(img, x, y, null);
			g.drawImage(img, x,y, 75,75 , null); //(0,0) center

	}
	
}
