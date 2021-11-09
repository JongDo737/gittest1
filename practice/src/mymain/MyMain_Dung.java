package mymain;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// awt -> Ȯ�� -> swing
// Frame		  JFrame
public class MyMain_Dung extends JFrame {
	
	
	
	JPanel gamePan;

	ExplosionManager explosionManager = new ExplosionManager();

	DDongManager dDongManager = new DDongManager(explosionManager);
	
	
	public MyMain_Dung() {
		super("�����ϱ�");

		//��ġ
		this.setLocation(200, 100);
		
		//������ �ʱ�ȭ
		init_gamepan();
		
		//Ÿ�̸� �ʱ�ȭ
		init_timer();
		

		//���콺 �̺�Ʈ �ʱ�ȭ
		init_mouse_event();
		
		//DDong dDong = new DDong(); DDong.java���� �� ���� �� �������� Ȯ���ϱ�����
		
		
		//ũ�⺯�� �Ұ�
		setResizable(false);

		pack();

		//�������
		this.setVisible(true);

		//�����ڵ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//���콺 �̺�Ʈ �ʱ�ȭ
	private void init_mouse_event() {
		// TODO Auto-generated method stub
		MouseAdapter adapter = new MouseAdapter() {
			//���콺 ������ ��
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				//���⼭ ��Ʈ����
				explosionManager.make_explosion(e.getX(), e.getY());
			}
		};
		
		gamePan.addMouseListener(adapter);
	}
	//Ÿ�̸� �ʱ�ȭ
	private void init_timer() {
		// TODO �ڵ� ������ �޼ҵ� ����
		// �͸�Ŭ������ ������
		// ��ư, Ÿ�̸�, �޴��� ���Ǹ����� ����� ����
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �ڵ� ������ �޼ҵ� ����
				//
				//��ǥ�̵� ��´�� �����۾�
				Process();
				
				//�ٽñ׷��� : repaint();�� Invalid(��ȿȭ)������ �����ض�
				//Rectangle rect = new Rectangle(0,0,100,100);//0,0���� 100px, 100px�� �׸�
				//gamePan.repaint(rect); rect ������ �ٽñ׷���
				gamePan.repaint();//��������� ȣ���ϴ°�(gamePan paintComponent()����ȣ��)
			}
		};
		
		//����Ʈ �߸�����ϸ� Ÿ�̸Ӹ� ���� ���缭 �������
		//10 : 0.001�������� listener ȣ��
		Timer timer = new Timer(10, listener);
		timer.start();
	}

	//��ǥ�̵� ��´�� �����۾�
	protected void Process() {
		// TODO �ڵ� ������ �޼ҵ� ����
		//�˻���
		dDongManager.make_ddong();
		
		//���̵�
		dDongManager.move();
		
		//�����̹��� �ε��� ����
		explosionManager.move();
	}
	
	//������ �ʱ�ȭ �޼ҵ�
	private void init_gamepan() {
		// TODO �ڵ� ������ �޼ҵ� ����
		//�����ǿ� �׷����ϱ� ������ �͸�Ŭ������ ������
		gamePan = new JPanel() {
			//�����ǿ� ���� �׷����ϱ� ������ ������
			@Override
			protected void paintComponent(Graphics g) {
				// TODO �ڵ� ������ �޼ҵ� ����
				
				//ȭ�������(���ȭ�鳪��)
				//���� ����� ����
				g.clearRect(0, 0,  // x,y
					    MyConst.GamePan.GAMEPAN_W,  //width
						MyConst.GamePan.GAMEPAN_H); //height
			
			//�˱׸���
			dDongManager.draw(g);
			
			//���߱׸���
			explosionManager.draw(g);
			
			}
			
		};
		
		//Dimension : ���� ���� �����ϴ� ��
		gamePan.setPreferredSize(
									new Dimension
									(
										MyConst.GamePan.GAMEPAN_W, 
										MyConst.GamePan.GAMEPAN_H
									)
								);
		
		this.add(gamePan);
	}

	public static void main(String[] args) {
		new MyMain_Dung();
		
		
	}
}