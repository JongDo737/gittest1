package mymain;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 똥 관리(움직임 및 그리기 화면에서 없어지기)
public class DDongManager {
	
	//final을 삭제할경우 변수처리가 가능함...
	//20번에 한번씩 만듬
	public static final int DDONG_MAKE_INTERVAL=20;

	/*
	 똥을 생성헀다가 똥을 없애야하니까 자동으로 생성 및 삭제를 하기위한
	 ArrayList를 사용
	*/
	public List<DDong> ddong_list = new ArrayList<DDong>();
	
	Random rand = new Random();
	
	int ddong_make_interval = DDONG_MAKE_INTERVAL;
	
	ExplosionManager explosionManager;
	
	public DDongManager(ExplosionManager explosionManager) {
		// TODO Auto-generated constructor stub
		explosionManager = explosionManager;
	}

	// 똥만드는 메소드(난이도 있음 이 메소드)
	public void make_ddong() {
		//초당 5개 생성
		if(ddong_make_interval == DDONG_MAKE_INTERVAL)
		{
			DDong dDong = new DDong(); //똥생성
			dDong.pos.y = -dDong.pos.height;// 똥이미지 크기에 -를 붙임
			//dDong.pos.width/2는 화면에서 안보이는 경우를 대비해 반은 보여주게 설정
			dDong.pos.x = rand.nextInt(MyConst.GamePan.GAMEPAN_W) - dDong.pos.width/2;//0 ~ 399
			dDong.speed = rand.nextInt(3) + 3; // 3~5
			
			//생성된 DDong를 리스트에 추가
			ddong_list.add(dDong);
		}
		
		ddong_make_interval--;
		if(ddong_make_interval<0) 
			ddong_make_interval = DDONG_MAKE_INTERVAL;
		
	}
	
	// 똥 움직이기(똥 사이즈만큼 가지고 있음 배열이)
	public void move() {
		for (int i = 0; i < ddong_list.size(); i++) {
			DDong dDong = ddong_list.get(i);
		
			//개선루푸돌려도 상관없음
			//화면 밖으로 벗어난 경우
			if(dDong.move()==false)
			{
				ddong_list.remove(i);
			}
		}
	}
	
	// 똥 그리기
	public void draw(Graphics g) {
		for (int i = 0; i < ddong_list.size(); i++) {
			DDong dDong = ddong_list.get(i);
			dDong.draw(g);
		}
		
	}
	
}
