package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame{

	JTextArea area;
	static int count =0;
	final static int LEFT_KEY = 37;
	final static int UP_KEY = 37;
	final static int RIGHT_KEY = 37;
	final static int DOWN_KEY = 37;
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}

	private void addEventListener() {
//		area.addKeyListener(this); // 다형성 적용
		area.addKeyListener(new KeyAdapter() {	 
			//key어뎁터 사용 implements 떄문에 필요없는 메서드들 재정의 해놓은걸 간단하게 어뎁터 이용해서 필요한 메서드만 사용
			@Override
			public void keyPressed(KeyEvent e) {
				String[] arKey = { "왼쪽방향키", "위쪽방향키", "오른쪽방향키", "아래쪽방향키" };
				for (int i = 0; i < 4; i++) {
					if (e.getKeyCode() == (KeyEvent.VK_LEFT+i)) {
						area.append(arKey[i]);
						count++;
						
						if(count%5==0) {
							area.append("\n");
						}
					}
				}
			}
		});
	}

//	 문자를 눌렀을 때 호출, 문자키에만 반응한다.
//	@Override
//	public void keyTyped(KeyEvent e) {
//		System.out.println("KeyType : "+e.getID());
//
//	}
//
//	 키보드를 눌렀을 때 호출, 모든 키보드에 반응합니다.
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : "+e.getID());
//		System.out.println(e.getKeyCode());
//		
//		area.setText(e.getKeyCode()+""); //getKeyCode()의 반환값은 int 이기 떄문에 + "" 해주면 문자열로 변경됌
//		area.append(e.getKeyCode() + "\n"); // 누를떄마다 띄워짐
//		 위쪽 방향키 아래쪽 방향키 ..... 출력 37 38 39 40
//		
//	}
//
//	 키보드를 땠을때 호풀, 모든 키보드에 반응한다.
//	@Override
//	public void keyReleased(KeyEvent e) {
//		 TODO Auto-generated method stub
//		System.out.println("keyReleased : "+e.getID());
//	}

}
