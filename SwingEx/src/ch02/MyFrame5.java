package ch02;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame {
	
	JLabel label; 
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("hello java ~ ");
		label.setSize(150, 50);
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		
	}
	
	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {
			
			//마우스가 떨어졌을 때 실행되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			//마우스가 눌러졌을을 때 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			//마우스가 나갔을 때 실행되는 메서드
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			//마우스가 들어왔을 때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			//마우스가 클릭되었을 때 실행되는 메서드
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("x : "+e.getX());
				System.out.println("y : "+e.getY());
				label.setLocation(e.getX(), e.getY());
			}
		});
		
	} // end of addEventListener
	
	// 메인 함수
	public static void main(String[] args) {
		new MyFrame5();
	}
	
	
}




