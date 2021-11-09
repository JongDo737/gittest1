package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame{

	JTextArea area;
	static int count =0;
	final static int LEFT_KEY = 37;
	final static int UP_KEY = 37;
	final static int RIGHT_KEY = 37;
	final static int DOWN_KEY = 37;
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}

	private void addEventListener() {
//		area.addKeyListener(this); // ������ ����
		area.addKeyListener(new KeyAdapter() {	 
			//key��� ��� implements ������ �ʿ���� �޼���� ������ �س����� �����ϰ� ��� �̿��ؼ� �ʿ��� �޼��常 ���
			@Override
			public void keyPressed(KeyEvent e) {
				String[] arKey = { "���ʹ���Ű", "���ʹ���Ű", "�����ʹ���Ű", "�Ʒ��ʹ���Ű" };
				for (int i = 0; i < 4; i++) {
					if (e.getKeyCode() == (KeyEvent.VK_LEFT+i)) {
						area.append(arKey[i]);
						count++;
						
						if(count%5==0) {
							area.append("\n");
						}
					}
				}
			}
		});
	}

//	 ���ڸ� ������ �� ȣ��, ����Ű���� �����Ѵ�.
//	@Override
//	public void keyTyped(KeyEvent e) {
//		System.out.println("KeyType : "+e.getID());
//
//	}
//
//	 Ű���带 ������ �� ȣ��, ��� Ű���忡 �����մϴ�.
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : "+e.getID());
//		System.out.println(e.getKeyCode());
//		
//		area.setText(e.getKeyCode()+""); //getKeyCode()�� ��ȯ���� int �̱� ������ + "" ���ָ� ���ڿ��� �����
//		area.append(e.getKeyCode() + "\n"); // ���������� �����
//		 ���� ����Ű �Ʒ��� ����Ű ..... ��� 37 38 39 40
//		
//	}
//
//	 Ű���带 ������ ȣǮ, ��� Ű���忡 �����Ѵ�.
//	@Override
//	public void keyReleased(KeyEvent e) {
//		 TODO Auto-generated method stub
//		System.out.println("keyReleased : "+e.getID());
//	}

}
