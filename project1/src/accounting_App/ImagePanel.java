package accounting_App;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		// �ҷ����� �̹����� ���ο� ���θ� ��������
		// setSize : �⺻����� ������
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		// setPreferredSize : ���� ���� ������?
		// �ΰ��� �� ����� ������ ����� �����̉�
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

	// Dimension�� ���ؼ� ������ ���ο� ���� ���̸� ���� ����� �Ǵ�
	// ���� ���α׷��� ���鶧 �� �̹����� ���缭 ���� �� ����
	public Dimension getDim() {
		return new Dimension(img.getWidth(null), img.getHeight(null)+47);
	}
}
