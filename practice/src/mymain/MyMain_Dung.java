package mymain;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// awt -> 확장 -> swing
// Frame		  JFrame
public class MyMain_Dung extends JFrame {
	
	
	
	JPanel gamePan;

	ExplosionManager explosionManager = new ExplosionManager();

	DDongManager dDongManager = new DDongManager(explosionManager);
	
	
	public MyMain_Dung() {
		super("똥피하기");

		//위치
		this.setLocation(200, 100);
		
		//게임판 초기화
		init_gamepan();
		
		//타이머 초기화
		init_timer();
		

		//마우스 이벤트 초기화
		init_mouse_event();
		
		//DDong dDong = new DDong(); DDong.java에서 똥 가로 값 나오는지 확인하기위함
		
		
		//크기변경 불가
		setResizable(false);

		pack();

		//보여줘라
		this.setVisible(true);

		//종료코드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//마우스 이벤트 초기화
	private void init_mouse_event() {
		// TODO Auto-generated method stub
		MouseAdapter adapter = new MouseAdapter() {
			//마우스 눌렀을 때
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				//여기서 터트려라
				explosionManager.make_explosion(e.getX(), e.getY());
			}
		};
		
		gamePan.addMouseListener(adapter);
	}
	//타이머 초기화
	private void init_timer() {
		// TODO 자동 생성된 메소드 스텁
		// 익명클래스로 재정의
		// 버튼, 타이머, 메뉴가 엑션리스터 사용할 예정
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 자동 생성된 메소드 스텁
				//
				//좌표이동 출력대상 변경작업
				Process();
				
				//다시그려라 : repaint();가 Invalid(무효화)영역을 갱신해라
				//Rectangle rect = new Rectangle(0,0,100,100);//0,0부터 100px, 100px만 그림
				//gamePan.repaint(rect); rect 영역만 다시그려라
				gamePan.repaint();//결과적으로 호출하는것(gamePan paintComponent()간접호출)
			}
		};
		
		//임포트 잘못사용하면 타이머를 각각 맞춰서 해줘야함
		//10 : 0.001간격으로 listener 호출
		Timer timer = new Timer(10, listener);
		timer.start();
	}

	//좌표이동 출력대상 변경작업
	protected void Process() {
		// TODO 자동 생성된 메소드 스텁
		//똥생성
		dDongManager.make_ddong();
		
		//똥이동
		dDongManager.move();
		
		//폭발이미지 인덱스 증가
		explosionManager.move();
	}
	
	//게임판 초기화 메소드
	private void init_gamepan() {
		// TODO 자동 생성된 메소드 스텁
		//게임판에 그려야하기 때문에 익명클래스로 재정의
		gamePan = new JPanel() {
			//게임판에 똥을 그려야하기 때문에 재정의
			@Override
			protected void paintComponent(Graphics g) {
				// TODO 자동 생성된 메소드 스텁
				
				//화면지우기(흰색화면나옴)
				//판을 지우기 위해
				g.clearRect(0, 0,  // x,y
					    MyConst.GamePan.GAMEPAN_W,  //width
						MyConst.GamePan.GAMEPAN_H); //height
			
			//똥그리기
			dDongManager.draw(g);
			
			//폭발그리기
			explosionManager.draw(g);
			
			}
			
		};
		
		//Dimension : 폭과 높이 관리하는 것
		gamePan.setPreferredSize(
									new Dimension
									(
										MyConst.GamePan.GAMEPAN_W, 
										MyConst.GamePan.GAMEPAN_H
									)
								);
		
		this.add(gamePan);
	}

	public static void main(String[] args) {
		new MyMain_Dung();
		
		
	}
}