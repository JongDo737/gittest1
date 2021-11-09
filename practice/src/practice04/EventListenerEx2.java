package practice04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListenerEx2 extends JFrame implements ActionListener{
	
	ArrayList<JButton> buttons;
	final int BUTTON_NUM = 5;
	public EventListenerEx2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("이벤트 리스너 연습2");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttons = new ArrayList<>();
		for (int i = 0; i < BUTTON_NUM; i++) {
			buttons.add(new JButton((i+1)+"번 버튼"));
		}
		
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		for (int i = 0; i <buttons.size(); i++) {
			this.add(buttons.get(i));
		}
	}
	private void addEventListener() {
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton)e.getSource();
		for (int i = 0; i < buttons.size(); i++) {
			if(clickedButton.getText().equals(buttons.get(i).getText())) {
				System.out.println((i+1)+"번이 클릭되었습니다.");
			}
		}
	}
	public static void main(String[] args) {
		new EventListenerEx2();
	}
}
