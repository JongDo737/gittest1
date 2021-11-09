package ch01;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame{

	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("No Layout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		
		buttons.add(new JButton("1"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));		
		//1. 버튼 두개 더 생성
		buttons.add(new JButton("4"));		
		buttons.add(new JButton("5"));		
	}
	public void setInitLayout() {
		setVisible(true);
		//좌표값으로 컴포넌트 위치를 지정할 때는
		setLayout(null);
		
		//버튼의 크기 설정
		buttons.get(0).setSize(50,50);
		buttons.get(1).setSize(50,50);
		buttons.get(2).setSize(50,50);
		buttons.get(3).setSize(50,50);
		buttons.get(4).setSize(50,50);
		//버튼의 위치
		buttons.get(0).setLocation(20,400);
		buttons.get(1).setLocation(120,400);
		buttons.get(2).setLocation(220,400);
		buttons.get(3).setLocation(320,400);
		buttons.get(4).setLocation(420,400);
		//add
		add(buttons.get(0));
		add(buttons.get(1));
		add(buttons.get(2));
		add(buttons.get(3));
		add(buttons.get(4));
		
	}
	
	public static void main(String[] args) {
		new NoLayoutEx();
	}
	
}
