package control;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case : 특정 변수의 값에 따라 서로 다른 코드를 실행한다
		
		int num = 4;
		
		// if의 조건이 모두 특정 변수와 연관되어 있고, 값의 범위가 아닌 특정값의 일치여부이다
		if(num == 1)			System.out.println("one");
		else if(num == 2)		System.out.println("two");
		else if(num == 3)		System.out.println("three");
		else					System.out.println("other");
		System.out.println();
		
		// switch ~ case
		switch(num) {
			case 1: System.out.println("ONE");		break;
			case 2: System.out.println("TWO");		break;
			case 3: System.out.println("THREE");	break;
			default:System.out.println("OTHER");
		}
		
		// 제한적인 상황에서 if 대신 사용할 수 있다
		// if에 대해서 가독성을 올리거나, 1:1 대칭관계를 나타내기 좋다
	}
	
}
