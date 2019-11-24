// 기초 산술연산 : 정수 1개 입력받아 부호 바꿔 출력하기

package questions;

import java.util.Scanner;

public class q_040 {

	public static void main(String[] args) {
		
		int before;
		int after;
		
		Scanner sc = new Scanner(System.in);
		
		before = sc.nextInt();
		after = before*(-1);
		
		System.out.println(after);

	}

}
