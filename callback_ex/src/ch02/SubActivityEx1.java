package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivityEx1 extends JFrame implements ActionListener{
	
	JButton btnKor;
	JButton btnAm;
	JButton btnCh;
	CallbackBtn2 callbackBtn2;
	
	public SubActivityEx1(CallbackBtn2 callbackBtn2) {
		this.callbackBtn2 = callbackBtn2;
		setTitle("버튼들");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		setVisible(true);
		btnKor = new JButton("한국");
		btnAm = new JButton("미국");
		btnCh = new JButton("중국");
		add(btnKor);
		add(btnAm);
		add(btnCh);
		
		btnKor.addActionListener(this);
		btnAm.addActionListener(this);
		btnCh.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton)e.getSource();
		if(clickedButton == btnKor) {
			callbackBtn2.passCountry("Korea");
			callbackBtn2.Korean();
		}else if(clickedButton == btnAm) {
			callbackBtn2.passCountry("America");
			callbackBtn2.American();
		}else if(clickedButton == btnCh) {
			callbackBtn2.passCountry("China");
			callbackBtn2.Chinese();
		}
		
	}

}
