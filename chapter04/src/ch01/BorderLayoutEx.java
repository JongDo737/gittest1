package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = { "북", "센터", "남", "동", "서" };
	String[] directions = {BorderLayout.NORTH,
			BorderLayout.CENTER,
			BorderLayout.SOUTH,
			BorderLayout.EAST,
			BorderLayout.WEST};
	
	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}
	//값을 초기화하는 메서드
	private void initData() {
		//부모클래스 에서 상속받은 메서드들
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		borderLayout = new BorderLayout();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
			
		}
	}
	//배치 하는 메서드
	private void setInitLayout() {
		//화면이 보이게해줌
		setVisible(true);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i] );
		}
//		super.add(buttons[0], BorderLayout.NORTH );
//		super.add(buttons[1], BorderLayout.CENTER );
//		super.add(buttons[2], BorderLayout.SOUTH );
//		super.add(buttons[3], BorderLayout.EAST );
//		super.add(buttons[4], BorderLayout.WEST );
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	
}
