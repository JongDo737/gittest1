package practice05;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ImageMoving extends JFrame{
	
	BufferedImage backgroundImage;
	BufferedImage ImageIcon;
	
	MyImagePanel myImagePanel;
	JPanel panel;
	BorderLayout borderLayout;
	JButton button1;
	JButton button2;
	
	
	static int x= 200;
	static int y= 200;
	

	public ImageMoving() {
		initData();
		setInitLayout();
		addEventListener();
		
		
	}
	private void initData() {
		setTitle("���� �ѹ���");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			ImageIcon = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		myImagePanel = new MyImagePanel();
		panel = new JPanel();
		borderLayout = new BorderLayout();
		button1 = new JButton("��ư 1");
		button2 = new JButton("��ư 2");
		

	}
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		myImagePanel.setPreferredSize(new Dimension(500,400));
		add(myImagePanel,borderLayout.NORTH);
		
		panel.setLayout(new FlowLayout());
		panel.add(button1);
		panel.add(button2);
		add(panel,borderLayout.SOUTH);

	}
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					x = (x<0) ? 0 : x-10;
				}
				else if(e.getKeyCode()==KeyEvent.VK_UP) {
					y = (y<0) ? 0 : y-10;
				}
				else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					x = (x>400) ? 400 : x+10;
				}
				else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					y = (y>400) ? 400 : y+10;
				}
				repaint();
			}
		});

	}
	private class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage,0,0,500,500,null);
			g.drawImage(ImageIcon,x,y,80,80,null);
		}
	}

	public static void main(String[] args) {
		new ImageMoving();
	}

}
