package ch03;

public class MainTest {

	public static void main(String[] args) {
		
		//��Ŀ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		SBSnews sbsnews = new SBSnews();
		
		
		//�������
		MyArticle myArticle = new MyArticle(hackerNews,sbsnews);
		myArticle.complete();
		
		//
	}

}
