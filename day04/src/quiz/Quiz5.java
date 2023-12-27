package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int eleA, eleB, eleC;		// 각 엘레베이터 현재위치  (랜덤)
		int user;					// 현재 탑승할 위치 (입력값)
		int min = 0;				// 거리중 최소값
		int divA, divB, divC;		// 현재위치와 엘레베이터의 차이 (거리)

		eleA = ran.nextInt(15) + 1;	// 1 ~ 15
		eleB = ran.nextInt(15) + 1; // 1 ~ 15
		eleC = ran.nextInt(15) + 1; // 1 ~ 15
		
		// 1) 현재 위치 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 위치 : ");
		user = sc.nextInt();
		
		// 2) 현재 위치 - 각 엘리베이터, 차이 구하기
		System.out.println("현재위치 : " + user);
		System.out.printf("현재 엘레베이터 위치 : %d   %d   %d\n",eleA, eleB, eleC);
		divA = user - eleA;
		divB = user - eleB;
		divC = user - eleC;
	
		
		// 3) 차이에 절대값 처리하기 => 거리
		if(divA < 0 ) divA *= -1;
		if(divB < 0 ) divB *= -1;
		if(divC < 0 ) divC *= -1;
		
		System.out.println("각엘레베이터 차이 -> " +"A : "+ divA + " B : " + divB + " C : " +  divC );
		
		// 4) 거리중에서 최소값 찾기
		
		if (divA > divB && divC > divB) min = divB;
		if (divB > divC && divA > divC) min = divC;
		if (divC > divA && divB > divA) min = divA;
		
		System.out.println("최소거리 : " + min);
		
		// 5) 최소값과 일치하는 엘리베이터에 대한 문장 출력하기
		
		if(min == divA) System.out.println("A 엘레베이터가 이동합니다");
		if(min == divB) System.out.println("B 엘레베이터가 이동합니다");
		if(min == divC) System.out.println("C 엘레베이터가 이동합니다");
		
		
		// 6) 마무리
		sc.close();  
		
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
		
		// ctrl  + shift + _  창나누기
		
		// 1) 현재 위치 입력받기
		// 2) 현재 위치 - 각 엘리베이터, 차이 구하기
		// 3) 차이에 절대값 처리하기 => 거리
		// 4) 거리중에서 최소값 찾기
		// 5) 최소값과 일치하는 엘리베이터에 대한 문장 출력하기
		// 6) 마무리
		
	}
}
