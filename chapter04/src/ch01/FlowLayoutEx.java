package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {

//	private JButton[] button= new JButton[6];
	// ArrayList로 변경해주세요
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	final int JBUTTON_SIZE = 16;

	// 문제해결능력 C R U D
	// 분할 앤 정복방식 <---
	// 1. 생성방법
	// 2. 추가하는 방법
	// 3. 값을 출력하는 방법

	public MyFrame2() { // 생성자
		initData();
		setInitLayout();
	}

	private void initData() { // 데이터 초기화 메서드
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10)); // 1씩 떨어뜨려서 배치

		// 배열을 사용하는 방법
//		for(int i=0;i<button.length;i++) {
//			button[i] = new JButton((i+1)+"번째 버튼");
//		}
//		button[0] = new JButton("1번째 버튼");
//		button[1] = new JButton("2번째 버튼");
//		button[2] = new JButton("3번째 버튼");
//		button[3] = new JButton("4번째 버튼");
//		button[4] = new JButton("5번째 버튼");
//		button[5] = new JButton("6번째 버튼");

		//ArrayList는 처음 사이즈가 0입니다.
		//그래서 i<buttons.size(); 가아니리 실제 값인 6을 넣어줘야한다.
		for (int i = 0; i < JBUTTON_SIZE; i++) {
			buttons.add(new JButton((i + 1) + "번째 버튼"));
		}

	}// end of initData

	private void setInitLayout() {
		setVisible(true);

		for (int i = 0; i < JBUTTON_SIZE; i++) {
			add(buttons.get(i));
		}
//		for (int i = 0; i < button.length; i++) {
//			this.add(button[i]);
//		}
//		this.add(button[0]);
//		this.add(button[1]);
//		this.add(button[2]);
//		this.add(button[3]);
//		this.add(button[4]);
//		this.add(button[5]);

	}// end of setInitLayout
}// end of myFrame2

public class FlowLayoutEx {
	public static void main(String[] args) {
		new MyFrame2();
	}
}