package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 복합대입 연산
		// 산술연산과 대입연산을 같이 수행한다
	
		int num = 0;
		System.out.println("num : " + num);
		
		num = num + 1;	// 현재 num값에 1을 더한 값을 다시 num에 대입한다
						// 산술연산 + 와 대입연산 =이 같이 있다
						// 좌변과 우변에 동일한 변수 num이 있다
						// num의 값이 기존값에 비해 1 늘어나는 식이다
		System.out.println("num : " + num);
		
		num += 1;		// 산술연산을 대입연산 앞으로 이동시키고
						// 우변의 num을 생략한다
						// 위에 있는 num = num + 1 과 동일한 수식이다
		
		System.out.println("num : " + num);
		
		int binaryNumber = 1;
		System.out.println(binaryNumber);      // binaryNumber = 1
		
		binaryNumber = binaryNumber* 2;
		System.out.println(binaryNumber);     // binaryNumber = 1 * 2  =  2
		
		binaryNumber *= 2;
		System.out.println(binaryNumber);     // binaryNumber = 2 * 2  =  4		
		
		binaryNumber *= 2;
		System.out.println(binaryNumber);	// binaryNumber = 4 * 2  =  8		
		
		for(int i = 0 ; i < 15 ; i++) {      //   0부터 15가전까지 1씩증가하며 조건을 반복한다
			binaryNumber *= 2;				 //  binaryNumber에 2씩 곱한다   현재값은 8  그값에 *2가 된다
			System.out.println(binaryNumber); // 곱한값이 출력된다  16, 32  .... 
		}
	}
}
