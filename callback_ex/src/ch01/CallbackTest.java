package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//�ݹ�
//�������̽��� �����Ѵ�.
interface CallbackBtnAction {

	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedTenAddBtn();
	public void clickedTenMinusBtn();
	public void clickedgobBtn();
	//�Ű������� �� ���ް���
	public void passValue(int value);

}// end of interface

//�ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 �����Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
	}

	@Override
	public void clickedAddBtn() {
		// �ݹ�Ǿ����� �޼��� :
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");

	}

	@Override
	public void clickedMinusBtn() {
		// �ݹ�Ǿ����� �޼��� :
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedTenAddBtn() {
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count+=10;
		label.setText(count + "");

		
	}

	@Override
	public void clickedTenMinusBtn() {
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count-=10;
		label.setText(count + "");

		
	}

	@Override
	public void clickedgobBtn() {
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count*=count;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		System.out.println("value ���� ���� ���� : "+ value);
		label.setText(value+"");
	}
}// end of MainActivity

// �ݸ� ( ȣ���� ) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ�� �Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnTenAdd;
	JButton btnTenMinus;
	JButton btngop;
	JButton btnpassValue;
	// 1. ��������� ������ ���ش�.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿� !!!
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnTenAdd = new JButton("���ϱ� 10 ��ư");
		btnTenMinus = new JButton("���� 10 ��ư");
		btngop = new JButton("���� ��ư");
		btnpassValue = new JButton("�� ���� ��ư");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnTenAdd);
		add(btnTenMinus);
		add(btngop);
		add(btnpassValue);
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnTenAdd.addActionListener(this);
		btnTenMinus.addActionListener(this);
		btngop.addActionListener(this);
		btnpassValue.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if (clickedButton == btnAdd) {
			System.out.println("���ϱ��ư Ŭ���Ǿ����ϴ�.");
			callbackBtnAction.clickedAddBtn();
		} else if (clickedButton == btnMinus) {
			System.out.println("�����ư Ŭ���Ǿ����ϴ�.");
			callbackBtnAction.clickedMinusBtn();
		}else if (clickedButton == btnTenAdd) {
			System.out.println("���ϱ� 10 ��ư Ŭ���Ǿ����ϴ�.");
			callbackBtnAction.clickedTenAddBtn();
		}else if (clickedButton == btnTenMinus) {
			System.out.println("���� 10 ��ư Ŭ���Ǿ����ϴ�.");
			callbackBtnAction.clickedTenMinusBtn();
		}else if (clickedButton == btngop) {
			System.out.println("������ư Ŭ���Ǿ����ϴ�.");
			callbackBtnAction.clickedgobBtn();
		}else if (clickedButton == btnpassValue) {
			callbackBtnAction.passValue(100);
		}
	}
}

public class CallbackTest {

	public static void main(String[] args) {
		MainActivity mainActivity = new MainActivity();
		// MainActivity �� CallbackBtnAction�������̽��� �����߱⶧���� �־��(������)
		// �ּҰ��� �־���
		new SubActivity(mainActivity);
	}

}
