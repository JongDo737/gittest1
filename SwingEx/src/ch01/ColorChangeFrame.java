package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame implements ActionListener {

	BorderLayout borderLayout = new BorderLayout();
	JPanel panel1;
	JPanel panel2;
	ArrayList<JButton> buttons;
	String[] colors = { "빨간색", "주황색", "노란색", "초록색", "파란색" };
	final int BUTTON_NUM = 5;
	Color[] ArColors = new Color[BUTTON_NUM];

	public ColorChangeFrame() {
		InitData();
		setInitLayout();
		addEventListener();
	}

	@Override
	protected void InitData() {
		
		super.InitData();
		setTitle("이벤트 리스너 연습3");
		setSize(500, 500);
		
		ArColors[0] = Color.red;
		ArColors[1] = Color.orange;
		ArColors[2] = Color.yellow;
		ArColors[3] = Color.green;
		ArColors[4] = Color.blue;
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();
		buttons = new ArrayList<JButton>();
		
		for (int i = 0; i < BUTTON_NUM; i++) {
			buttons.add(new JButton(colors[i]));
		}

	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		setLayout(borderLayout);
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));  //1
		add(panel1, BorderLayout.NORTH);// borderLayout은 위치를 지정해줘야함

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());	//2
		add(panel2, BorderLayout.SOUTH);

		for (int i = 0; i < buttons.size(); i++) {
			panel2.add(buttons.get(i));
		}

	}

	@Override
	protected void addEventListener() {
		super.addEventListener();
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼1이 눌러졌으면 panel1 색깔을 빨간색으로 변경
		// 버튼2이 눌러졌으면 panel1 색깔을 노란색으로 변경
		JButton clickedButton = (JButton) e.getSource();
		for (int i = 0; i < buttons.size(); i++) {
			if (clickedButton.getText().equals(buttons.get(i).getText())) {
				panel1.setBackground(ArColors[i]);
			}
		}
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}
}
