package practice11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//콜리 (호출자)
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
		setTitle("콜리");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		leftBtn = new JButton("왼쪽으로 돌려버려");
		rightBtn = new JButton("오른쪽으로 돌려버려");
		
		
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
			for(int i=0;i<10;i++) {
				callbackBtn.picktureSwing(true);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		else if(clickedButton == rightBtn){
			callbackBtn.picktureSwing(false);
		}
		
	}
}
