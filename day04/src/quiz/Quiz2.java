package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 2의 배수 혹은 3의 배수 혹은 6배수를 각각 구분하여 출력하세요
		// 정수를 하나 입력받고, 위 3개중 해당하는 하나만 출력하면 됩니다.
		// 6의 배수를 입력받으며 2와 3의 배수에 모두 해당하지만 6의 배수만 출력해야 합니다.
		
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num%6 == 0) {
			System.out.println(num + "은6의 배수 입니다.");
		}
		else if (num %3 == 0) {
			System.out.println(num + "은 3의 배수 입니다.");
		}
		else if (num % 2 == 0) {
			System.out.println(num + "은 2의 배수 입니다");
		}
	//	else System.out.println("해당사항이 없습니다.");
		// else 로 마무리하는 형식을 권장하지만, 상황에 따라서 작성하지 않는 경우도 있다
		sc.close();
	}
}
