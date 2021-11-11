package practice10;

public class MainTest {

	public static void main(String[] args) {
		SBSNews sbsNews = new SBSNews();
		MyArticle myArticle = new MyArticle(sbsNews);
		myArticle.complete();

	}

}
