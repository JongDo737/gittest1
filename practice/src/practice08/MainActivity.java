package practice08;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JFrame implements CallbackBtn{

	int count;
	JLabel label;
	
	public MainActivity() {
		count = 0;
		setTitle("콜백연습");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		label = new JLabel(count + "");
		add(label,BorderLayout.CENTER);
		
	}
	
	
	
	@Override
	public void addBtn() {
		System.out.println("더하기 버튼");
		count++;
		label.setText(count+"");
		
	}

	@Override
	public void minusBtn() {
		System.out.println("빼기 버튼");
		count--;
		label.setText(count+"");
	}
	

}
