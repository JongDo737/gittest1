package practice11;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//콜백 받는 객체
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
		setTitle("진호 돌리기 - 콜백연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon = new BufferedImage[4];
		try {
			backgroundImage = ImageIO.read(new File("볼링장.jpg"));
			jinHo = ImageIO.read(new File("진호.png"));
			ImageIcon[0] = ImageIO.read(new File("진호1.png"));
			ImageIcon[1] = ImageIO.read(new File("진호2.png"));
			ImageIcon[2] = ImageIO.read(new File("진호3.png"));
			ImageIcon[3] = ImageIO.read(new File("진호4.png"));
		} catch (Exception e) {
			System.err.println("파일을 찾을 수 없습니다.");
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
			num++;
			if (num == 4) {
				num = 0;
			}

		} else {
			num--;
			if (num == -1) {
				num = 3;
			}
		}
		jinHo = ImageIcon[num];
		repaint();

	}

}
