package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		//��� ������ Ư��
		System.out.println(order1.order_id);
		System.out.println(order1.buyer_id);
		System.out.println(order1.product_id);
		System.out.println(order1.seller_id);
		System.out.println(order1.order_Date);
		
		
		//1. order1 ���� �־��ּ���.
		order1.order_id = 1234;
		order1.buyer_id = "��ٻ��";
		order1.product_id = 18846;
		order1.seller_id = "����Ⱦƿ�";
		order1.order_Date = "2021-10-21";
		System.out.println(order1.order_id);
		System.out.println(order1.buyer_id);
		System.out.println(order1.product_id);
		System.out.println(order1.seller_id);
		System.out.println(order1.order_Date);
		
		UserInfo userInfo1 = new UserInfo();
		userInfo1.user_Id = "jongdo";
		userInfo1.user_PW = "123qwe";
		userInfo1.user_Name = "������";
		userInfo1.user_Address = "����";
		userInfo1.user_Pnum = "010-1234-1234";
		System.out.println(userInfo1.user_Id);
		System.out.println(userInfo1.user_PW);
		System.out.println(userInfo1.user_Name);
		System.out.println(userInfo1.user_Address);
		System.out.println(userInfo1.user_Pnum);
	}

}
