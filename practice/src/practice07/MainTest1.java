package practice07;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;
	BorderLayout borderLayout;
	MyImagePanel myImagePanel;
	JPanel panel;
	JButton srtbut;
	JButton stpbut;
	Thread thread;
	static int x1 = 200;
	static int y1 = 200;
	static int x2 = 0;
	static int y2 = 300;
	static boolean isOn = true;

	public MyFrame() {
		initData();
		setInitLayout();
		addEventListener();
		thread.start();
	}

	private void initData() {
		setTitle("가현이 피하기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("지평생막걸리.jpg"));
			imageIcon1 = ImageIO.read(new File("최수빈.png"));
			imageIcon2 = ImageIO.read(new File("김가현.png"));
		} catch (Exception e) {
			System.err.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		borderLayout = new BorderLayout();
		myImagePanel = new MyImagePanel();
		panel = new JPanel();
		srtbut = new JButton("아니야 더마실꺼야 !");
		stpbut = new JButton("가현아 술 그만먹어");
		thread = new Thread(myImagePanel);

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(borderLayout);
		add(myImagePanel, borderLayout.CENTER);
		add(panel, borderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panel.add(srtbut);
		panel.add(stpbut);

	}

	private void addEventListener() {
		srtbut.addActionListener(this);
		stpbut.addActionListener(this);
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키눌림");
				int keyNum = e.getKeyCode();
				switch (keyNum) {
				case KeyEvent.VK_LEFT:
					x1 = (x1 < 0) ? 0 : x1 - 10;
					break;

				case KeyEvent.VK_UP:
					y1 = (y1 < 0) ? 0 : y1 - 10;
					break;

				case KeyEvent.VK_RIGHT:
					x1 = (x1 > 500) ? 500 : x1 + 10;
					break;
				case KeyEvent.VK_DOWN:
					y1 = (y1 > 400) ? 400 : y1 + 10;
					break;
				}
				repaint();
			}
		});

	}

	private class MyImagePanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(imageIcon1, x1, y1, 100, 100, null);
			g.drawImage(imageIcon2, x2, y2, 200, 200, null);
		}

		@Override
		public void run() {
			boolean check = true;
			while (true) {
				if (isOn) {
					if (check) {
						x2 += 10;
						if (x2 > 500) {
							check = false;
						}
					} else {
						x2 -= 10;
						if (x2 < 0) {
							check = true;
						}
					}
					if (x1 == x2 && y1 == y2) {
						imageIcon1 = null;
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				repaint();
			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if (clickedButton == srtbut) {
			isOn = true;
		} else if (clickedButton == stpbut) {
			isOn = false;
		}

	}
}

public class MainTest1 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
