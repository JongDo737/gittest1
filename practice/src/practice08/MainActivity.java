package practice08;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JFrame implements CallbackBtn{

	int count;
	JLabel label;
	
	public MainActivity() {
		count = 0;
		setTitle("�ݹ鿬��");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		label = new JLabel(count + "");
		add(label,BorderLayout.CENTER);
		
	}
	
	
	
	@Override
	public void addBtn() {
		System.out.println("���ϱ� ��ư");
		count++;
		label.setText(count+"");
		
	}

	@Override
	public void minusBtn() {
		System.out.println("���� ��ư");
		count--;
		label.setText(count+"");
	}
	

}
