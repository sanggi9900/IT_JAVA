package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
/*
 		놀이공원에 있는 놀이기구에 대한 이용 요금을 계산해야 한다
 		이 놀이기구는 탑승하면 기본 3000원의 요금을 받고
 		이용 기간에 따라 추가 요금이 발생한다
 		그 시간과 요금은 아래와 같다
 		
 		시간			요금
 		0 ~ 30		3000
 		31 ~ 40		3500
 		41 ~ 50		4000
 		...
 		
 		시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
 */		
		int time;  // 이용시간
		
		int fee = 3000; // 기본요금
		int c_money;  // 추가 요금
	
		
		
		  Scanner sc = new Scanner(System.in); 
		  System.out.print("이용시간 입력 : "); 
		  time = sc.nextInt();
		  
		/* if(time > 30) { 
		 *  // 추가 시간을 계산하는 식
			// 요금 = 기본요금 + 추가요금
			// 추가요금 = (추가시간(10분단위) + 보정값) * 500
			// 요금 += 추가요금
		 * c_money = ((time-30)/10)*500; // 기본식 
		 * if(time % 10 != 0) { // 시간이10분단위로 나누어 떨어지지 않으면
		 * c_money += 500; // 500원을 추가로 넣는다 
		 * } 
		 * fee += c_money; // 계산이 끝난 요금을 총 요금에 더한다
		 * 
		 * } System.out.printf("총 이용시간 : %d분\n 총 금액 : %d원",time, fee);
		 * 
		 */
		
		
		if(time > 30) {
			fee += (time -21) / 10 * 500;
		}
		
		System.out.printf("요금 : %,d원\n", fee);
		sc.close();
		
	}
}
