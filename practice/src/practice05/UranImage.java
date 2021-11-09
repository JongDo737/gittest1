package practice05;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UranImage extends JFrame {
	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	BufferedImage imageIcon2;
	MyImagePanel myImagePanel;
	static int x = 200;
	static int y = 200;

	public UranImage() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("궁예한테서 도망치고 싶은 유란 !");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("UranBackground.jpg"));
			imageIcon = ImageIO.read(new File("Uran.png"));
			imageIcon2 = ImageIO.read(new File("궁예.png"));
		} catch (Exception e) {
			System.err.println("파일을 찾지 못했습니다.");
			System.exit(0);
		}
		myImagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(myImagePanel);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyNum = e.getKeyCode();
				switch (keyNum) {

				case KeyEvent.VK_LEFT:
					x = (x < 0) ? 0 : x - 20;
					break;

				case KeyEvent.VK_UP:
					y = (y < 0) ? 0 : y - 20;
					break;

				case KeyEvent.VK_RIGHT:
					x = (x > 900) ? 900 : x + 20;
					break;
				case KeyEvent.VK_DOWN:
					y = (y > 900) ? 900 : y + 20;
					break;
				}
				repaint();
			}
		});

	}

	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 1000, 1000, null);
			g.drawImage(imageIcon, x, y, 100, 100, null);
			g.drawImage(imageIcon2, 10, 0, 200, 200, null);
		}
	}
	

	public static void main(String[] args) {
		new UranImage();
	}

}
