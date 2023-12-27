package control;

import java.util.Scanner;

// 이클립스 디버깅하기
// 1) 중단점을 설정한다 (Ctrl + shift + b) or 줄번호 왼쪽 클릭
// 2) F11을 눌러서 디버깅을 시작한다 (화면 구성을 바꿀건지 물어보면 yes)
// 3) F6번을 누를때 마다 한줄씩 실행되고, 우측에서 변수의 값을 확인할 수 있다 

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		
		System.out.println("주민등록번호 13 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요
		/*
		 * int year ; int moon; int sun; String gender;
		 * 
		 * year = num1/10000; 
		 * if(year >=50 ) year =(num1/10000) +1900; 
		 * else year = (num1/10000) + 2000;
		 * 
		 * moon = (num1%10000)/100; 
		 * sun = num1 % 100;
		 * 
		 * if((num2/1000000) % 2 == 0 ) gender = "여성입니다."; 
		 * else gender = "남성입니다.";
		 * 
		 * 
		 * 
		 * System.out.println("출생연도 : " + year); 
		 * System.out.println("2자리 출생월 : " + moon); 
		 * System.out.println("2자리 출생일 : " + sun); 
		 * System.out.println("성별은 무엇인가요? " + gender);
		 */
		
		int year, month, date, genderNumber;	//	num1		year	month	date
												//	930516
		date = num1 % 100;						//	930516		?		?		16
		
		num1 /= 100;							//	9305		?		?		16	
		
		month = num1 % 100;						//	9305		?		5		16
		
		year = num1 / 100;						//	9305		93		5		16
		
		genderNumber = num2 / 1000000;		 
		
		System.out.printf("%d, %d ,%d\n",year, month, date);
		
// %: 서식
// d: 10진수
//
		switch (genderNumber) {
		case 1: case 2:
			year += 1900;
		break;
		case 3: case 4:
			year += 2000;
		break;
		}
		
		
		
		System.out.printf("%d, %d ,%d (%d)\n",year, month, date,genderNumber);
		
		sc.close();
	}
}
