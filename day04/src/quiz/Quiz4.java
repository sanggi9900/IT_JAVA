package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력받아서 이동하는데 걸리는 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요
	
		// 입력받기 위한 객체
		// 구간당 4분
		// 이동한 구간 수(입력받아야함)
		// 조건에 따라 사용할 변수(계산해야 함)
		// 입력 안내 메세지
		// 입력 받기
		// 입력값으로 분 구하기
		// 분이 60이하이면
		// 입력받기
		// 아니면 (분이 60을 초과하면)
		// 시간은 전체 시간에서 60을 나눈 몫
		// 분은 전체 시간에서 60을 나눈 나머지
		// 각각출력
		// 마무리
		
		int sta, time_m;  //  이동구간수, 걸린시간 						
		int r_time = 4;	  // 구간당 시간						
		
		Scanner sc = new Scanner(System.in);   // 입력 함수 스캐너함수 열기
		System.out.print("이동한 구간수 : ");		  // 입력하기위한 문구(보여지는 문구)
		sta = sc.nextInt();					  // 이동구간 입력	
																																																												
		time_m = sta * r_time;				 //  총시간 = 이동구간 * 구간당시간 
											
		if (time_m <= 60) System.out.println("걸린시간(분) : " + time_m +"분");  // 총시간이 60보다 작거나 같은면 분으로 출력한다
   		if (time_m > 60) System.out.printf("걸린시간(시간) %d 시  %d분 ", time_m/60,time_m%60); // 총시간이 60보다 크면  총시간/60 의  값이 시  , 총시간%60의 값이 분이다  
		sc.close();  // 마무리 
		//  작업의 순서는 열고 사용 닫기 이다 닫지 않아도실행은 되지만 
   		// Resource leak: 'sc' is never closed 문구뜬다
	}
}

/*
Scanner sc = new Scanner(System.in);	// 입력받기 위한 객체
int perStation = 4;						// 구간당 4분
int distance;							// 이동한 구간 수(입력받아야 함)
int hour, minute;						// 조건에 따라 사용할 변수(계산해야 함)

System.out.print("이동한 구간 수를 입력하세요 : ");	// 입력 안내 메시지
distance = sc.nextInt();						// 입력받기

minute = distance * perStation;	// 입력값으로 분 구하기

if(minute <= 60) {										// 분이 60이하이면
	System.out.println("걸린 시간 : " + minute + "분");	// 그냥 출력
}
else {					// 아니면 (분이 60을 초과하면)
	hour = minute / 60;	// 시간은 전체 시간에서 60을 나눈 몫
	minute %= 60;		// 분은 전체 시간에서 60을 나눈 나머지
	System.out.printf("걸린 시간 : %d시간 %d분\n", hour, minute); // 각각 출력
}

sc.close();	// 마무리
}
}*/