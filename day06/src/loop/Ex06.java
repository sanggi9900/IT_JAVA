package loop;

public class Ex06 {
	public static void main(String[] args) {
		// 30일동안 은행에 돈을 입금한다
		// 첫날에 10원, 그다음날에 20원, 다음날에 40원
		// 이런 식으로 전날의 두배를 준비하여 입금한다
		// 30일째 입금이 끝난후
		// 은행에 누적된 총 금액은 얼마인지 계산하여 출력하세요
		// (금액에 천단위 구분기호 콤마를 적용하여 출력하세요)
		int day = 1; 
 		long money = 0;
		long b_money = 10;
		while(day <= 30) {
				money += b_money;
		System.out.printf("%d일째 금액 : %,d원\n", day, money);
				b_money *= 2;
				day += 1;
		}
		System.out.printf("%d일째 금액 : %,d원\n", day-1, money);
	}
} 
// 워하는 위치에 오른쪽 마우스클릭 toggle Breakpoint 누르기
// f11만 눌려서 실행후 f6 눌러서 디버깅시작 확인하기
// 플로우 차트, 순서도