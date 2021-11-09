package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로 리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// 문제
		// 배열을 이용해서 shoppingCart 변수(배열)에 객체를 담아봅시다.

		Book[] shoppingCart = new Book[5];

		// 2. 사고싶은 책을 장바구니에 담아보자
		shoppingCart[0] = book1;
		shoppingCart[1] = book4;
		shoppingCart[2] = book5;

		// 3. 장바구니에 담은 정보를 화면에 출력하세요

		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
				System.out.println();
			}
		}
		
		//4. 수정
		shoppingCart[0] = book5;
		
		//5. 인덱스 1번째에 book3추가해주세요
		//0, 1=book3, 1-->2, 2-->3 , 
		shoppingCart[0]=book2;
		shoppingCart[1]=book3;
		shoppingCart[2]=book4;
		shoppingCart[3]=book5;
		//배열에 추가를 할라면 인덱스 연산을 통해서 처리해야한다.
		
		//삭제 -> 배열에 담겨있는 값을 제거하
		shoppingCart[2] = null;
	}
}
