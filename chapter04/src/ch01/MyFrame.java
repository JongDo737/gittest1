package ch01;

import javax.swing.JFrame;
//GUI프로그램
public class MyFrame extends JFrame{
		
	public MyFrame() {
		setTitle("첫번째 GUI 프로그램 작성");		//제목 설정
		setSize(400,400);	//화면 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//나가면 종료
		setVisible(true);		//프레임화면이 보이고 안보이고
	}
	public static void main(String[] args) {
		new MyFrame();
		
		
	}
}
