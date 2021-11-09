package mymain;

import java.awt.Graphics;

//아이템
public class Explosion extends Item {
	
	public static int INDEX_INTERVAL=2;
	int index;//이미지 첨자관련 자료형
	
	int index_interval=INDEX_INTERVAL;
	
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		if(index_interval==2)
		{
			index++;
		}
		index_interval--;
		if(index_interval<0)
			index_interval=INDEX_INTERVAL;
		
		// 이동된 인덱스가 이미지 첨자범위내에 있냐?
		return (index < MyImages.img_exp.length);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(MyImages.img_exp[index], pos.x, pos.y, null);
	}

}
