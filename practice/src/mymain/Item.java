package mymain;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Item {

	//위치 + 크기
	public Rectangle pos = new Rectangle();
		
	//행위속성
	public abstract boolean move();
	//Graphics g 그릴라면 필요함
	public abstract void draw(Graphics g);
	
}