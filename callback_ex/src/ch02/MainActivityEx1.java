package ch02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
//�ݹ��� ����Ǵ°�
public class MainActivityEx1  extends JFrame implements CallbackBtn2{

	String country ="������� �λ� ?";
	JLabel label;
	JLabel labelCountry;
	public MainActivityEx1() {
		setTitle("�ݹ鿬��");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		label = new JLabel();
		labelCountry = new JLabel(country);
		add(labelCountry);
		add(label);
	}
	
	@Override
	public void Korean() {
		country = "Korea";
		label.setText(": �ȳ��ϼ���");
		
	}

	@Override
	public void American() {
		country = "America";
		label.setText(": Hello");
	}

	@Override
	public void Chinese() {
		country = "China";
		label.setText(": ni hao");
	}

	@Override
	public void passCountry(String country) {
		labelCountry.setText(country);
		
	}
	
}
