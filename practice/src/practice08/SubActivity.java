package practice08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivity extends JFrame implements ActionListener{
	
	JButton plusBtn;
	JButton minusBtn;
	CallbackBtn callbackBtn;
	
	public SubActivity(CallbackBtn callbackBtn) {
		this.callbackBtn = callbackBtn;
		setTitle("�ݸ�");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		plusBtn = new JButton("���ϱ��ư");
		minusBtn = new JButton("�����ư");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		add(plusBtn);
		add(minusBtn);
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton)e.getSource();
		if(clickedButton == plusBtn) {
			callbackBtn.addBtn();
		}else if(clickedButton == minusBtn) {
			callbackBtn.minusBtn();
		}

	}

}
