package operator;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// 연산자. operator : 값을 계산하는데 사용되는 기호 및 단어
		
		// 대입연산 : =   우변의 값을  좌변의 공간에 복사하여 대입한다
		// 산술연산 : +, -, *, /, %
		// 복합대입연산(배정대입연산) : +=, -=, *=, /=, %=
		// 단항증감연산 : ++, --
		// 비교연산 : >, <, >=, <=, ==, !=
		// 논리연산 : &&, ||, !
		// 비트연산 : &, |, <<, >> 
		// 삼항연산 : A ? B : C
		// 기타연산 : [] . () , instanceof
		
		// 산술연산
		// +, -, *, /, %
		int n1 = 10;
		int n2 = 3;
		// 컴퓨터의 원초적인 기능, 근본은 계산기이다!!
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
		System.out.println();
		// 나머지 연산의 용도
		// 1) 홀수/짝수, 약수/배수 관계를 파악하는데 사용
		System.out.println("n1이 n2로 나누어 떨어지는가 : " + (n1 % n2 == 0));
		System.out.println("124가 2로 나누어 떨어지는가 : " + (124 % 2 == 0));
		System.out.println();
		
		// 2) 정수의 자릿수를 구분하기 위해서 사용
		int idNumber = 930516;
		int date = idNumber % 100;	// 0의 개수만큼 오른쪽의 숫자를 가져온다      930516  % 100  = 16   date  = 16
		idNumber = idNumber / 100;	// 0의 개수만큼 오른쪽의 숫자를 버린다         930515  /  100 = 9305    idNumber는 9305로 초기화
		int month = idNumber % 100;		//   9305  %  100 = 05  month = 05
		int year = idNumber / 100;      //   9305   / 100 =  93  year = 93
		System.out.printf("%d년 %d월 %d일\n\n", year, month, date);
		
		// 3) 난수(Random)의 범위를 제한하기 위해서 사용
		Random ran = new Random();
		int num = ran.nextInt();  // int 범위의 정수중 하나가 출력된다
		System.out.println("num : " + num);
		
		// 어떤 수를 6으로 나누면 그 나머지는 6미만의 범위를 가진다
		if(num < 0) {			// 랜덤값이 0보다 작으면
			num = num * -1;		// -1을 곱해서 부호를 반전시킨다
		}
		int num2 = num % 6 + 1;   // 1 ~ 6 까지의 범위를 표현			
		System.out.println("num2 : " + num2);
		
		int num3 = ran.nextInt(6) + 1;  // ran.nextInt(6)이  0~ 5 까지의 범위를 가진다
		System.out.println("num3 : " + num3);
		
		
		
		
		
		
	}
}
