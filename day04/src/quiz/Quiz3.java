package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 서로 다른 세정수를 입력받은 다음 가장 큰 수를 하나 출력하세요
		
		int n1;
		int n2;
		int n3;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.print("n1 : ");
		n1 = sc.nextInt();
		System.out.print("n2 : ");
		n2 = sc.nextInt();
		System.out.print("n3 : ");
		n3 = sc.nextInt();
		max = n1;
		if( n1 > n2 && n1 > n3) max = n1;     	// 값이 없으니 일다 n1을 대입해둔다
		else if(n2 > n1 && n2 > n3) max =n2;	// 최대값보다 n2가 더 크면 n2를 최대값으로 지정한다
		else  max = n3;	// 최대값보다 n3가 더 크면 n3를 최대값으로 지정한다
		
		System.out.println("제일 큰수 : " + max);
		
		sc.close();
	}
}
