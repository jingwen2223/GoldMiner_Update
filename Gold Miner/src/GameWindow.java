//Credit for the artworks authors： quaternius(the crown), Johann C(the diamond).


import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;



public class GameWindow extends JFrame{
	
	
	
	ArrayList <Object>objectList = new ArrayList<Object>(); //store gold and stone;
	
	background bg= new background(); //make new background
	Line line = new Line(this);
	Gold gold = new Gold();
	Diamond diamond = new Diamond();
	Rock rock = new Rock();
	

	{  	
		
		boolean isPlace = true; //Can the object able to place in the spawn location
		for(int i=0; i<8; i++) {//code bock for generating 11 gold or diamond or skull 
			double random = Math.random();
				Gold block;
						//store the object that currently spawn
				if(random<0.3) {block = new Diamond();}
				
				else if(random<0.7) {block= new Gold();}
				//else {objectList.add(new Diamond());}
				else {block =new Skull();}
				for(Object obj:objectList) {
					if(block.getRec().intersects(obj.getRec())) {  //filter out all the object spawn above and check if it intersect 
						isPlace = false;}	
					}
				
				if(isPlace) {objectList.add(block);}
				else {isPlace=true;i--;}
		}
			
			//		objectList.add(new Gold());  Original code for one form of Gold object
		
		for(int i=0; i<4; i++) {
			double random2 = Math.random();
						//code  for generating amount of gold
			if(random2<0.3) {rock = new Rock();}
			else if(random2<0.7) {gold = new Skull();}
			for(Object obj:objectList) {
				if(rock.getRec().intersects(obj.getRec())) {  //filter out all the object spawn above and check if it intersect 
					isPlace = false;}	
				}
			
			if(isPlace) {objectList.add(rock);}
			else {isPlace=true;i--;}
		}
	
	}
	
	Image offScreenImage; //make a screenImage
	
	void launch() {
		this.setVisible(true);
		this.setSize(700,900);
		//this.setLocation(null);
		 setLocationRelativeTo(null);
		this.setTitle("Gold Miner");

		addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton()==1) {line.state=1;}
            }});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		 //clicking the "X" for exsiting the GAME
		while(true) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		}

	
	@Override
	public void paint(Graphics g) {
		offScreenImage = this.createImage(700, 900); //(width, height)  To draw Image before it print again
		Graphics gImage =offScreenImage.getGraphics();
		
		bg.paintSelf(gImage); //only call method from background paintSefl method
		line.paintSelf(gImage);
		line.lines(gImage);
		
		
		for(Object obj:objectList) {
			obj.paintSelf(gImage);
		}
	//	gold.paintSelf(gImage);
		rock.paintSelf(gImage);
		
		g.drawImage(offScreenImage, 0, 0, null);
	
	}
	
	
		
	public static void main(String[]args) {
		GameWindow gameWindow = new GameWindow();
		gameWindow.launch();
		
	}
	
		
}
	
		
	
	

