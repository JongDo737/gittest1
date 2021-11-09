package practice05;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HaImageMove extends JFrame {
	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	MyImagePanel myImagePanel;
	static int x = 200;
	static int y = 200;

	public HaImageMove() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("ÇÏ½Â¹Î ±¸ÇÏ±â");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("ÀÛÂ÷.jpg"));
			imageIcon = ImageIO.read(new File("ÇÏ½Â¹Î.png"));
		} catch (Exception e) {
			System.err.println("ÆÄÀÏÀÌ ¾ø½À´Ï´Ù");
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
		new HaImageMove();
	}
}
