package loop;

public class Quiz1_1 {
	public static void main(String[] args) {
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		String name ="황상기";
		for(int i=0; i < 5 ; i++) {
			System.out.println(name);
		}
		// 2) 0부터 5까지 한줄에 출력하세요
		for(int i =0; i <=5 ;i++) {
			System.out.print(i + " ");
		}System.out.println();
		// 3) 5부터 0까지 한줄에 출력하세요
		for(int i = 5; i >=0; i--) {
			System.out.print(i + " ");
		}System.out.println();
		// 4) 1부터 100까지의 합계를 구하여 출력하세요
		int sum=0;
		for(int i =0; i <=100;i++) {
			sum += i;
		}System.out.println(sum);
		// 5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
		for(int i =1; i<=100; i++) {
			if(i % 7 == 0) {
				System.out.print( i + " ");
			}
		}
	}
}
