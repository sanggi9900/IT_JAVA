package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰수를 화면에 출력하세요
		
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) System.out.println("둘중 더 큰수 : " + num1);
		else System.out.println("둘중 더 큰수 :" + num2);
		
		sc.close();
		
	}
}
