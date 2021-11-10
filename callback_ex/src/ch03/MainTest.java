package ch03;

public class MainTest {

	public static void main(String[] args) {
		
		//해커뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		SBSnews sbsnews = new SBSnews();
		
		
		//기사작정
		MyArticle myArticle = new MyArticle(hackerNews,sbsnews);
		myArticle.complete();
		
		//
	}

}
