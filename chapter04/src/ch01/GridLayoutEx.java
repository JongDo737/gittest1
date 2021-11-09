package ch01;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private final int MAX_COUNT = 6;
	

	//
	public GridLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		
		setTitle("GridLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton((i+1)+""));
		}
		
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2,3));			//행과 열로 배치
		
		//JFrame에 더한다
		for (int i = 0; i < MAX_COUNT; i++) {
			add(buttons.get(i));			
		}
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
