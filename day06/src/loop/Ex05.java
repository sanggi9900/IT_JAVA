package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int menu ;
		// 0 아닐때 반복한다
		//while(menu != 0) {	// 메뉴의 값이 0이면 종료이므로 반복을 실행하지 않게 하고 싶다
		do { 	// 조건을 따지지 말고, 일단 한번 실행해라 (최소 1회 실행을 보장한다)
			System.out.println("1. 입력");
			System.out.println("2. 입력");
			System.out.println("0. 입력");
			System.out.println("입력 >>> ");
			menu = sc.nextInt();   // 최소한번의 실행으로 do 와 while의 차이다
		
		
		switch(menu) {
		case 1: System.out.println("입력을 선택했습니다."); break;
		case 2: System.out.println("출력을 선택했습니다."); break;
		case 0: break;
		default: System.out.println("메뉴를 잘못 선택했습니다.");
		}
	}while(menu != 0);	// 반복 수행후 조건을 판별하여 참이면 다시 실행해라
		
		System.out.println("프로그램을 종료합니다");
	sc.close();
}
}