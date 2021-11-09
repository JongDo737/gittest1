package mymain;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// �� ����(������ �� �׸��� ȭ�鿡�� ��������)
public class DDongManager {
	
	//final�� �����Ұ�� ����ó���� ������...
	//20���� �ѹ��� ����
	public static final int DDONG_MAKE_INTERVAL=20;

	/*
	 ���� �������ٰ� ���� ���־��ϴϱ� �ڵ����� ���� �� ������ �ϱ�����
	 ArrayList�� ���
	*/
	public List<DDong> ddong_list = new ArrayList<DDong>();
	
	Random rand = new Random();
	
	int ddong_make_interval = DDONG_MAKE_INTERVAL;
	
	ExplosionManager explosionManager;
	
	public DDongManager(ExplosionManager explosionManager) {
		// TODO Auto-generated constructor stub
		explosionManager = explosionManager;
	}

	// �˸���� �޼ҵ�(���̵� ���� �� �޼ҵ�)
	public void make_ddong() {
		//�ʴ� 5�� ����
		if(ddong_make_interval == DDONG_MAKE_INTERVAL)
		{
			DDong dDong = new DDong(); //�˻���
			dDong.pos.y = -dDong.pos.height;// ���̹��� ũ�⿡ -�� ����
			//dDong.pos.width/2�� ȭ�鿡�� �Ⱥ��̴� ��츦 ����� ���� �����ְ� ����
			dDong.pos.x = rand.nextInt(MyConst.GamePan.GAMEPAN_W) - dDong.pos.width/2;//0 ~ 399
			dDong.speed = rand.nextInt(3) + 3; // 3~5
			
			//������ DDong�� ����Ʈ�� �߰�
			ddong_list.add(dDong);
		}
		
		ddong_make_interval--;
		if(ddong_make_interval<0) 
			ddong_make_interval = DDONG_MAKE_INTERVAL;
		
	}
	
	// �� �����̱�(�� �����ŭ ������ ���� �迭��)
	public void move() {
		for (int i = 0; i < ddong_list.size(); i++) {
			DDong dDong = ddong_list.get(i);
		
			//������Ǫ������ �������
			//ȭ�� ������ ��� ���
			if(dDong.move()==false)
			{
				ddong_list.remove(i);
			}
		}
	}
	
	// �� �׸���
	public void draw(Graphics g) {
		for (int i = 0; i < ddong_list.size(); i++) {
			DDong dDong = ddong_list.get(i);
			dDong.draw(g);
		}
		
	}
	
}
