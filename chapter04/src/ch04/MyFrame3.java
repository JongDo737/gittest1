package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	
	private Image image;
	String imgName;
	
	
	public ImagePanel(String imgName) {
		this.imgName = imgName;
		image = new ImageIcon(this.imgName).getImage();
		}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0,0,getWidth(),getHeight(),null);
	}
}



public class MyFrame3 extends JFrame{
	private ImagePanel imagePanel1;
	private ImagePanel imagePanel2;
	private JButton button;
	public MyFrame3() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("Jpanel에 이미지넣기");
		setSize(500,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		imagePanel1 = new ImagePanel("어몽어스.jpg");
		imagePanel2 = new ImagePanel("among2.jpg");
		button = new JButton("버튼입니다.");
	}
	private void setInitLayout() {
		setVisible(true);
		add(imagePanel1);
		add(imagePanel2);
		imagePanel1.add(button);
	}
	public static void main(String[] args) {
		new MyFrame3();
	}
}
