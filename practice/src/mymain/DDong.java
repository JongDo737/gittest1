package mymain;

import java.awt.Graphics;

//똥 자신 한 개를 표현
public class DDong extends Item {
	public DDong() {
		// TODO Auto-generated constructor stub
		pos.width 	= MyImages.img_ddong.getWidth(null);
		pos.height 	= MyImages.img_ddong.getHeight(null);
		//System.out.println(pos.width);
	}
	
	public int speed;//이동속도
	
	@Override
	public boolean move() {
		// TODO Auto-generated method stub

		//이동한 결과
		//pos.t = pos.y + speed;
		pos.y += speed;
		//화면안에 있냐?
		return (pos.y <= MyConst.GamePan.GAMEPAN_H);
	}

	//자기 자신이 자신을 그림(?)
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(MyImages.img_ddong,pos.x,pos.y,null);
	}


	
	
}
