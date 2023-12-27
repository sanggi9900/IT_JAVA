package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {		// 가능하다면 순서도를 먼저 그리고 시작하기
	public static void main(String[] args) {
		Random ran = new Random();				// 랜덤변수 생성
		Scanner sc = new Scanner(System.in);	// 스캐너 생성
		int answer = ran.nextInt(100) + 1;		// 1 ~ 100 까지의 수 랜덤생성
		int user = -1 ;							// answer값과  user값이 절대일치 하지않는 수 반복문조건을 만족하기 위한수
		int count=0;							// count 초기화
		// 반복을 수행하면서
		//		사용자에게 값을 입력받고
		// 		만약 정답이 입력값보다 작으면 Down
		//			정답이 입력값돠 크면 up
		// 			일치하면 반복을 중단
		//			반복할때마다 횟수를 증가시키기
		//
		//	반복이 끝나면 정답과 횟술를 출력하고 종료
		
		while(answer != user) {				// answer가 user가 일치 하지 않으면 반복한다
		System.out.print("숫자 입력 : ");		
		user = sc.nextInt();				// user에  값 입력하기
		if (answer > user) System.out.println("UP!!"); 			// answer가 user 보다 크면   up 출력
		if (answer < user )System.out.println("DOWN!!");	 //   answer가 user 보   작으면  down 출력
		if(answer == user) {						// answer 와  user가 일치하면 
			System.out.println("정답입니다.~~");		// 정답 출력
			break;									// 반복문 탈출
		}
		
		count++;									// 반복 한번 실행할때마다  count값이 1씩올라간다
	 }
		System.out.println("횟수" + count);
	}
}