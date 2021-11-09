package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame{

	JButton button;
	JButton button2;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	private void initData() {
		setTitle("익명구현객체 사용해보기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("안녕하세용");
	}
	private void setInitLayout() {
		setVisible(true);
		add(button,BorderLayout.NORTH);
		add(button2,BorderLayout.SOUTH);
	}
	private void addEventListener() {
		
		ActionListener ac = new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {	
			System.out.println("버튼이 클릭되었습니다.");
			}
		
		//익명 구현 객체
		// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수 있다.
			
		};
		button.addActionListener(ac);
		button2.addActionListener(ac);
	}//end of addEventListener
//		button.addActionListener(new ActionListener() {
//			//추상메서드를 일반 메서드로 구현했다.
//			public void actionPerformed(ActionEvent e) {			
//			}
//		});
//	}
	public static void main(String[] args) {
		
//		MyFrame4 mf = new MyFrame();
//		만약 밑에 코드에서 
//		mf.button.getText("안녕하세요");
//		이렇게  사용할 것 아니면 굳이변수선언 없이 메모리에만 올려줘도 됌
		
		//익명 클래스( 인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할 필요없다.
		new MyFrame4();
	}
}
