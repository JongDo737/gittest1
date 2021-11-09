package mymain;

import java.awt.Image;

import javax.swing.ImageIcon;

//MyImages.img_ddong; 이런식으로 호출
public class MyImages {
	public static Image img_ddong;
	public static Image img_me;
	public static Image [] img_exp = new Image[27];
	
	static {
		img_ddong = new ImageIcon("Uran.png").getImage();
//		img_ddong = new ImageIcon("money.png").getImage();
		img_me = new ImageIcon("bate.gif").getImage();

		for(int i =0; i<img_exp.length; i++)// i=0 ~ 26
		{
			String filename = String.format("image_exp/exp_%02d.png", i+1);
			img_exp[i] = new ImageIcon(filename).getImage();
		}
	}
}