package practice10;

import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SBSNews extends JFrame implements WriteArticle{
	JLabel label;
	
	public SBSNews() {
		setTitle("SBS ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		label = new JLabel("��� ��� . . !");
		add(label,BorderLayout.CENTER);
	}
	
	public String printDate() {
		
		DateFormat fomater = new SimpleDateFormat("yyyy.MM.dd");
		return fomater.format(Calendar.getInstance().getTime());
		
	}
	
	@Override
	public void printArticle(String article) {
		label.setText("SBS���� \n\n"+article+"\n\n��� �ۼ��� : "+printDate());

		
	}

}
