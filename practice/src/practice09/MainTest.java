package practice09;

public class MainTest {

	public static void main(String[] args) {
		JTBCNews jtbcNews = new JTBCNews();
		
		MyArticle myArticle = new MyArticle(jtbcNews);
		myArticle.complet();

	}

}
