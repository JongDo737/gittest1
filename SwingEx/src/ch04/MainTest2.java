package ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame1 extends JFrame{
	
	public MyFrame1() {
		setTitle("gif 사용해보기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());	//FloaLayout특징 가로 길이가 부족하면 세로로 
		
		JLabel textLabel = new JLabel("펭하 입니다 !");
		ImageIcon img = new ImageIcon("img.gif");
		JLabel imgLabel = new JLabel(img);
		
		JLabel bottonTextLabel = new JLabel("연락하세요 ~~~");
		
		c.add(textLabel);
		c.add(imgLabel);
		c.add(bottonTextLabel);
		setSize(1000,500);
		setVisible(true);
	}
}



public class MainTest2 {

	public static void main(String[] args) {
		new MyFrame1();

	}

}
