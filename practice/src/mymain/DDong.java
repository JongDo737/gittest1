package mymain;

import java.awt.Graphics;

//�� �ڽ� �� ���� ǥ��
public class DDong extends Item {
	public DDong() {
		// TODO Auto-generated constructor stub
		pos.width 	= MyImages.img_ddong.getWidth(null);
		pos.height 	= MyImages.img_ddong.getHeight(null);
		//System.out.println(pos.width);
	}
	
	public int speed;//�̵��ӵ�
	
	@Override
	public boolean move() {
		// TODO Auto-generated method stub

		//�̵��� ���
		//pos.t = pos.y + speed;
		pos.y += speed;
		//ȭ��ȿ� �ֳ�?
		return (pos.y <= MyConst.GamePan.GAMEPAN_H);
	}

	//�ڱ� �ڽ��� �ڽ��� �׸�(?)
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(MyImages.img_ddong,pos.x,pos.y,null);
	}


	
	
}
