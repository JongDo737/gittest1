package practice04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListenerEx1 extends JFrame implements ActionListener{

	JButton button1;
	JButton button2;
	
	public EventListenerEx1() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	private void initData() {
		setTitle("이벤트리스너 연습1");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("버튼 1");
		button2 = new JButton("버튼 2");

	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(button1);
		add(button2);
		

	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton)e.getSource();
		if(clickedButton.getText().equals(button1.getText())) {
			System.out.println("버튼 1번이 클릭되었습니다.");
		}
		else if(clickedButton.getText().equals(button2.getText())){
			System.out.println("버튼 2번이 클릭되었습ㄴ디ㅏ.");
		}
	}
	public static void main(String[] args) {
		new EventListenerEx1();
	}
}
