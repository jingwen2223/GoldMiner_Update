import java.awt.Color;
import java.awt.Graphics;

public class Line {
int x=200;  //start x,y
int y=350; //initialized x and y , not moving

int endx;
int endy;		//end x, y 

//endx = x+leng*cosa;
//endy = y+leng* sina;

double length =10;
double n = 0; //angle setting up

int dir =1;
int state;
//0: moving //1 catch //2 hook back 

GameWindow frame;
Line (GameWindow frame){this.frame= frame;}

void logic() {
	
	for(Object obj:this.frame.objectList) {
	if(endx>obj.x&&endx<obj.x+obj.width
			&&endy>obj.y&&endy<obj.y+obj.height) {
		state =3;
		System.out.println("1");
		obj.flag = true;  //all the other gold disappear;
	}
	}
}



void lines(Graphics g) {
	endx =  (int) (x + length*Math.cos(n*Math.PI)+20);
	//unit vector: x=r∗sin(θ),y=r∗cos(θ)
	endy = (int) (y + length*Math.sin(n*Math.PI)+20);
	
	g.setColor(Color.pink);//giving line a color
	
	
	g.drawLine(x, y, endx, endy);
	
	}


void  paintSelf(Graphics g) {
	logic();
	
	switch(state) {
		case 0:	
			//the line will be swinging at state 0;
			if(n<0.1) {dir=1;}
			else if(n>1) {dir=-1;}
			n= n+0.007*dir;
		
		break;
		
		
		
		case 1:
			
			length = length +10;  //after clicking the mouse, the line will be extended to catch the object
			if(length<500) {
				length = length+5;
				lines(g);
				}
			else{state=2;}
			break;
			 
			
	

		case 2:
			
			length = length -5;  //auto come back to state 0 after the extended from state 2
			if(length>100) {
				length = length -10;
				lines(g);
				}
			
			 
			else{state=0;}
			break;
			
		case 3:
			
			int m=1;
			if(length>100) {
				length = length -15;
				lines(g);
				for(Object obj:this.frame.objectList) {
					if(obj.flag==true) {
						m=obj.m;//prevent all gold disappear
					obj.x=endx-obj.getWidth()/2;
					obj.y=endy;
					
					if(length<=100) {
						obj.x=-150;
						obj.y=-150;
						obj.flag=false;
						state=0;}
				}
				}
				
			
			
			try {
				Thread.sleep(m);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
			
}
	
	
}
}
}

