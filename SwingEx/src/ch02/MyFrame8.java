package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	static int x = 200;
	static int y = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�̹��� ��׶��� ����2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("����.png"));
		} catch (Exception e) {
			System.err.println("������ �����ϴ�."); // err�� �������� ǥ������
			System.exit(0); // ������ ������ ���α׷� ����
		}

		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false); // �׸� ũ�⸦ �ø��ų� ���̰� ����
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {	//�߻�Ŭ���������� Ŭ������ ������༭
			//�͸�����ü(�������� ����)�� ������ذ� (�ڿ� ��������)
			@Override
			public void keyPressed(KeyEvent e) {
				
				//switch������ ����
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				
					case KeyEvent.VK_UP :
						y = (y < 0) ? 0 : y-10;
						break;
					case KeyEvent.VK_LEFT :
						x= (x<0) ? 0: x-10;
						break;
					case KeyEvent.VK_RIGHT :
						x= (x>400) ? 400 : x+10;
						break;
					case KeyEvent.VK_DOWN :
						y=(y>400) ? 400 : y+10;
						break;
						
				}
				repaint();		//�ٽ� �׸��� �׷���
			}//end of keyPressed
		});

	}

	// ����Ŭ����
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, x, y, 80, 80, null);

		}
	}

}// end of class
