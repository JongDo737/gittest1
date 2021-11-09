package practice05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyActionListener extends JFrame{
	JTextArea area ;
	String[] st = {"��Ű","��Ű","����Ű","�Ʒ�Ű"};
	
	public KeyActionListener() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("Ű���� �ӽñ� ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
		
	}
	private void setInitLayout() {
		setVisible(true);
		this.add(area);

	}
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_LEFT) {
					area.append(st[0]);
				}else if(e.getKeyCode()== KeyEvent.VK_UP) {
					area.append(st[1]);
				}else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					area.append(st[2]);
				}else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
					area.append(st[3]);
				}
			}
		});

	}
	public static void main(String[] args) {
		new KeyActionListener();
	}
}
