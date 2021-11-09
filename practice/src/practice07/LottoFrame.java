package practice07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener{
	LottoNumber lottonumber;
	LottoPanel lottoPanel;
	JButton button;
	int[] lottoNums = new int[lottonumber.LOTTO_NUM];
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {

		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lottoPanel = new LottoPanel();
		button = new JButton("로또 번호 생성하기");
		lottonumber = new LottoNumber();
		
		

	}
	private void setInitLayout() {
		setVisible(true);
		lottoPanel.setBackground(Color.ORANGE);
		add(button,BorderLayout.NORTH);
		add(lottoPanel,BorderLayout.CENTER);

	}
	private void addEventListener() {
		button.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		lottoNums = lottonumber.createNums();
		repaint();
		
	}
	private class LottoPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			Font font= new Font("궁서체", Font.BOLD, 20);
			g.setFont(font);
			int xPoint = 120;
			if(lottoNums[0] ==0) {
				g.drawString("로또 번호를 생성해 주세요", 120, 180);
			}
			else {
				for(int i=0; i<lottonumber.LOTTO_NUM;i++) {
					g.drawString(lottoNums[i]+"", xPoint, 180);
					xPoint+=50;
					
				}
			}
		}
	}
	public static void main(String[] args) {
		new LottoFrame();
	}

}
