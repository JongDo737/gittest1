package practice05;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageMove extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	MyImagePanel myImagePanel;
	static int x = 200;
	static int y = 200;

	public ImageMove() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 연습 ^^");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없습니다.");
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
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					x = (x < 0) ? 0 : x - 10;
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					y = (y < 0) ? 0 : y - 10;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					x = (x > 400) ? 400 : x + 10;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					y = (y > 400) ? 400 : y + 10;
				}
				repaint();
			}

		});

	}

	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, x, y, 80, 80, null);

		}

	}
	public static void main(String[] args) {
		new ImageMove();
	}
}
