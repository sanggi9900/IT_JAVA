package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 친구와 고기집에 갔다
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주1병(4500원), 맥주1병(5000원)을 고정으로 주문했다
		// 추가 주문한 삼겹살 양을 받아서 <- 여기가 입력받아야 할 값
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야하는지 계산하여 출력하는 프로그램을 작성하세요
	
		// 변수 선언 및 초기화
		int basic_meat1 = 3;
		int soju = 1;
		int macju = 1;
		int add_meat2;
		int money;
		int price1 = 8500;
		int price2 = 4500;
		int price3 = 5000;
		
		// 입력받기
		System.out.println("우리 식당에서는 기본 삼겹살 3이분으로 시작합니다.");
		System.out.println("삼겹살 3이분, 소주 1인분, 맥주 1병 주문되었습니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("추가 삼겹살 주문 : ");
		add_meat2 = sc.nextInt();	
		
		// 연산하기
		money = price1*(basic_meat1 + add_meat2)+ price2*soju + price3*macju ;
		
		// 출력하기
		System.out.printf("총금액 : %,d원, 1인당 결제 금액 : %,d원 ",money,money/2);
		
		// 마무리
		sc.close();
	}
}
