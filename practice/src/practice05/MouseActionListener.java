package practice05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseActionListener extends JFrame{
	JLabel label;
	
	public MouseActionListener() {
		initData();
		setInitLayout();
		addEventListener() ;
	
	}
	
	private void initData() {
		setTitle("마우스액션 리스너 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("안녕하세용 ~~~");
		label.setSize(150, 50);

	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);

	}
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setLocation(e.getX(), e.getY());
			}
			
		});

	}
	public static void main(String[] args) {
		new MouseActionListener();
	}

}
