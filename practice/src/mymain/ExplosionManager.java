package mymain;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ExplosionManager {

	public List<Explosion> explosion_list = new ArrayList<Explosion>();

	public void make_explosion(int x,int y) {
		
		Explosion exp = new Explosion();
		//   폭발위치 중앙에서 그려지겠끔 좌표 보정함
		exp.pos.x = x - MyImages.img_exp[0].getWidth(null)/2;
		exp.pos.y = y - MyImages.img_exp[0].getHeight(null)/2;
		
		explosion_list.add(exp);
				
		
	}
	
	public void move() {
		
		for(int i=0;i<explosion_list.size();i++) {
			Explosion exp = explosion_list.get(i);
			if(exp.move()==false) {//이미지 첨자범위 벗어났으면
				explosion_list.remove(i);
			}
		}
	}
	
	public void draw(Graphics g) {
		
		for(Explosion exp: explosion_list)
		{
			exp.draw(g);
		}
	}
	
}


/*
	똥이 어떻게 만들어지고 
	어떻게 움직이고 
	먼저 파악
*/