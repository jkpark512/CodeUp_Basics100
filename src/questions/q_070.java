// 기초 조건/선택실행구조 : 월 입력받아 계절 출력하기

package questions;

import java.util.Scanner;

public class q_070 {

	public static void main(String[] args) {
		
		int month;
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("winter");
			break;
			case 3:
			case 4:
			case 5:
				System.out.println("spring");
			break;
			case 6:
			case 7:
			case 8:
				System.out.println("summer");
			break;
			case 9:
			case 10:
			case 11:
				System.out.println("fall");
			break;
		}
		
		sc.close();

	}

}
