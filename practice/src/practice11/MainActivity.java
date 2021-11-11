package practice11;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//�ݹ� �޴� ��ü
public class MainActivity extends JFrame implements CallbackBtn {

	BufferedImage backgroundImage;
	BufferedImage[] ImageIcon;
	BufferedImage jinHo;
	MyImagePanel myImagePanel;
	static int num;

	public MainActivity() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("��ȣ ������ - �ݹ鿬��");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon = new BufferedImage[4];
		try {
			backgroundImage = ImageIO.read(new File("������.jpg"));
			jinHo = ImageIO.read(new File("��ȣ.png"));
			ImageIcon[0] = ImageIO.read(new File("��ȣ1.png"));
			ImageIcon[1] = ImageIO.read(new File("��ȣ2.png"));
			ImageIcon[2] = ImageIO.read(new File("��ȣ3.png"));
			ImageIcon[3] = ImageIO.read(new File("��ȣ4.png"));
		} catch (Exception e) {
			System.err.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		myImagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);

	}

	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(jinHo, 50, 50, 400, 400, null);
		}
	}

	@Override
	public void picktureSwing(boolean isLeft) {
		if (isLeft) {
			for (int i = 0; i < 10; i++) {
				num++;
				if (num == 4) {
					num = 0;
				}
				jinHo = ImageIcon[num];
				repaint();
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		} else {
			num--;
			if (num == -1) {
				num = 3;
			}
			jinHo = ImageIcon[num];
			repaint();
		}

	}

}
