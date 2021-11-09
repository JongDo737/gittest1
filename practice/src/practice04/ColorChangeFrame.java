package practice04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame extends JFrame implements ActionListener {

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
	ArrayList<JButton> buttons;
	final int BUTTON_NUM = 5;
	String[] stColor = { "������", "��Ȳ��", "�����", "�ʷϻ�", "�Ķ���" };
	Color[] arColor;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("���㵵�� Ŭ���� �÷�ü���� �����ӿ���");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();
		buttons = new ArrayList<>();
		for (int i = 0; i < BUTTON_NUM; i++) {
			buttons.add(new JButton(stColor[i]));
		}
		arColor = new Color[BUTTON_NUM];
		arColor[0] = Color.red;
		arColor[1] = Color.orange;
		arColor[2] = Color.yellow;
		arColor[3] = Color.green;
		arColor[4] = Color.blue;

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500,400));
		add(panel1,borderLayout.NORTH);
		
		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());	//�߰��Ǵ� ��ư�� ���� ���̾ƿ�?
		add(panel2,borderLayout.SOUTH);
		
		for (int i = 0; i < buttons.size(); i++) {
			panel2.add(buttons.get(i));
		}
		
		
	}

	private void addEventListener() {
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton)e.getSource();
		for (int i = 0; i < buttons.size(); i++) {
			if(clickedButton.getText().equals(buttons.get(i).getText())) {
				panel1.setBackground(arColor[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}
