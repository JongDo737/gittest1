package practice09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JTBCNews implements WriteArticle{

	private String printDate() {
		
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	
	@Override
	public void printArticle(String article) {
		System.out.println("JTBC NEWS");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사쓴날 : "+printDate());
		
	}

}
