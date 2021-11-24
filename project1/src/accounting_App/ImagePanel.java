package accounting_App;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		// 불러오는 이미지의 가로와 세로를 설정해줌
		// setSize : 기본사이즈를 정해줌
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		// setPreferredSize : 실제 편한 사이즈?
		// 두개를 다 해줘야 실제로 사이즈가 변경이됌
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

	// Dimension을 통해서 실제로 가로와 세로 넓이를 메인 페널이 되는
	// 실제 프로그램을 만들때 이 이미지에 맞춰서 구할 수 있음
	public Dimension getDim() {
		return new Dimension(img.getWidth(null), img.getHeight(null)+47);
	}
}
