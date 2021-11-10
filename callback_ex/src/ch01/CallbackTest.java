package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//콜백
//인터페이스를 선언한다.
interface CallbackBtnAction {

	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedTenAddBtn();
	public void clickedTenMinusBtn();
	public void clickedgobBtn();
	//매개변수로 값 전달가능
	public void passValue(int value);

}// end of interface

//콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의한다.
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
		// 콜백되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");

	}

	@Override
	public void clickedMinusBtn() {
		// 콜백되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedTenAddBtn() {
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count+=10;
		label.setText(count + "");

		
	}

	@Override
	public void clickedTenMinusBtn() {
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count-=10;
		label.setText(count + "");

		
	}

	@Override
	public void clickedgobBtn() {
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count*=count;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		System.out.println("value 값을 전달 받음 : "+ value);
		label.setText(value+"");
	}
}// end of MainActivity

// 콜리 ( 호출자 ) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnTenAdd;
	JButton btnTenMinus;
	JButton btngop;
	JButton btnpassValue;
	// 1. 멤버변수로 선언을 해준다.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요 !!!
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnTenAdd = new JButton("더하기 10 버튼");
		btnTenMinus = new JButton("빼기 10 버튼");
		btngop = new JButton("제곱 버튼");
		btnpassValue = new JButton("값 전달 버튼");
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
			System.out.println("더하기버튼 클릭되었습니다.");
			callbackBtnAction.clickedAddBtn();
		} else if (clickedButton == btnMinus) {
			System.out.println("빼기버튼 클릭되었습니다.");
			callbackBtnAction.clickedMinusBtn();
		}else if (clickedButton == btnTenAdd) {
			System.out.println("더하기 10 버튼 클릭되었습니다.");
			callbackBtnAction.clickedTenAddBtn();
		}else if (clickedButton == btnTenMinus) {
			System.out.println("빼기 10 버튼 클릭되었습니다.");
			callbackBtnAction.clickedTenMinusBtn();
		}else if (clickedButton == btngop) {
			System.out.println("제곱버튼 클릭되었습니다.");
			callbackBtnAction.clickedgobBtn();
		}else if (clickedButton == btnpassValue) {
			callbackBtnAction.passValue(100);
		}
	}
}

public class CallbackTest {

	public static void main(String[] args) {
		MainActivity mainActivity = new MainActivity();
		// MainActivity 는 CallbackBtnAction인터페이스를 구현했기때문에 넣어도됌(다형성)
		// 주소값을 넣어줌
		new SubActivity(mainActivity);
	}

}
