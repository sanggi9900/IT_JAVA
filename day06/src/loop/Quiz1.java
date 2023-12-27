package loop;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		String name = "황상기";
		int num=0, num1 = 0,num2 = 5;
		System.out.println("5회 반복");
		while(num < 5) {
			System.out.println(name);
			if(num > 5) {
				break;
			}
			
			num++;

		}
		
		System.out.println();
		
		// 2) 0부터 5까지 한줄에 출력하세요
		System.out.print("0 ~ 5 까지수 : ");
		while(num1 <= 5) {
			System.out.print(num1 + " ");
			
			if(num1 > 5) {
				break;
			}
			num1++;
		}
		
		System.out.println();
		System.out.print("5 ~ 0 까지수 : ");
		// 3) 5부터 0까지 한줄에 출력하세요
		while(num2 >= 0) {
			System.out.print(num2 + " " );
			
			if(num2 < 0) {
				break;
			}
			num2 -= 1;
		}
		System.out.println();
		
		// 4) 1부터 100까지의 합계를 구하여 출력하세요
		int num3=0;
			num2++;	
		while(num2 <= 100) {
			num3 +=num2 ;  // 항등원의 개념으로 누적합계를 구하긴 위해서 0,  누적곱은1 이다
			//System.out.println(num2);
			num2++;	
		}
		System.out.println("1부터 100 까지 합계 : " + num3);
		
		// 5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
		int num4 = 1;
		System.out.print("7의 배수 : ");
		while(num4 <= 100) {
			
			if(num4%7 == 0) {
				System.out.print( num4 + " ");
			}
			num4++;
		}
		num4 = 7;				// 초기값 변경
		while(num4 <= 100) {	// 조건은 그대로
			System.out.print(num4 + " ");
			num4 += 7; 		// 7씩 증가하기 때문에 if를 쓰지 않아도 된다
		}
		System.out.println();
		
	}
}
