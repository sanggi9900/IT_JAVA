package quiz;

import java.util.Scanner;

public class Quiz2_1 {
	// 친구와 고기집에 갔다
			// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
			// 이후에는 1인분씩 추가가 가능하다
			// 돼지고기 삼겹살 1인분이 8500원이고
			// 소주1병(4500원), 맥주1병(5000원)을 고정으로 주문했다
			// 추가 주문한 삼겹살 양을 받아서 <- 여기가 입력받아야 할 값
			// 총 결제해야 할 금액을 계산하고
			// 더치페이로 1인당 얼마를 내야하는지 계산하여 출력하는 프로그램을 작성하세요
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int b_order = 3;
			int order = 0;
			int pig  = 8500;
			int soju = 4500;
			int macju = 5000;
			int b_money = soju + macju + (b_order*pig);
			int money = 0;
			
			System.out.print("추가 주문 : ");
			order = sc.nextInt();
			
			money = b_money + (pig * order);
			
			
			System.out.printf("소주 1병 : %d, 맥주 1병 : %d, 기본주문 : %d , 추가주문 : %d\n",soju,macju,b_order*pig,order*pig);
			System.out.println("총 금액" + money + "인당 지불금액 : " + money/2);
			
			sc.close();
		}
}
