package mymain;

import java.awt.Graphics;

//������
public class Explosion extends Item {
	
	public static int INDEX_INTERVAL=2;
	int index;//�̹��� ÷�ڰ��� �ڷ���
	
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
		
		// �̵��� �ε����� �̹��� ÷�ڹ������� �ֳ�?
		return (index < MyImages.img_exp.length);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(MyImages.img_exp[index], pos.x, pos.y, null);
	}

}
