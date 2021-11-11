package practice11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//�ݸ� (ȣ����)
public class SubActivity extends JFrame implements ActionListener{
	JButton leftBtn;
	JButton rightBtn;
	CallbackBtn callbackBtn;
	public SubActivity(CallbackBtn callbackBtn) {
		this.callbackBtn = callbackBtn;
		initData();
		setInitLayout();
		
	}
	private void initData() {
		setTitle("�ݸ�");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		leftBtn = new JButton("�������� ��������");
		rightBtn = new JButton("���������� ��������");
		
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
		add(leftBtn);
		add(rightBtn);
		leftBtn.addActionListener(this);
		rightBtn.addActionListener(this);
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton)e.getSource();
		if(clickedButton == leftBtn) {
			callbackBtn.picktureSwing(true);
		}
		else if(clickedButton == rightBtn){
			callbackBtn.picktureSwing(false);
		}
		
	}
}
