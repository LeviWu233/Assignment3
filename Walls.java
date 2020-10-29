//assignment3
//Levi
//10/29/2020
//CSE142


import java.awt.*;


public class Walls{
	public static void main(String[] args){
		//set colors

		DrawingPanel panel = new DrawingPanel(650, 400);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.GRAY);
		rowA(g);//first part
		rowB(g);//second part
		rowC(g);//third part
		rowD(g);//fourth part
		rowE(g);//fifthe part
		rowF(g);//sixth part
	}		
	public static void rowA(Graphics g){
		for(int i=0;i<4;i++){
			g.setColor(Color.BLACK);
			g.drawRect(400+i*35,20+i*35,35,35);
		}
	}
	public static void rowB(Graphics g){
		for (int i=0;i<2;i++) {
			g.setColor(Color.BLACK);
			g.drawRect(400+i*35,90+i*35,35,35);
		}	
	}	
	public static void rowC(Graphics g){
		for(int i=0;i<2;i++){
			g.setColor(Color.BLACK);
			g.drawRect(470+i*35,20+i*35,35,35);
		}
	}
	public static void rowD(Graphics g){
		for (int i=0; i<4;i++){
			g.setColor(Color.WHITE);
			g.drawRect(435+i*35, 90+i*35,35,35);
		}
	}	
	public static void rowE(Graphics g){
		for (int i=0;i<2;i++){
			g.setColor(Color.WHITE);
			g.drawRect(435+i*35,90+i*35,35,35);
		}
	}
	public static void rowF(Graphics g){
		for (int i=0;i<2;i++){
			g.setColor(Color.WHITE);
			g.drawRect(505+i*35,20+i*35,35,35);
		}
	}
}