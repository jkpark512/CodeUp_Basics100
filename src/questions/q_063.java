// 기초 삼항연산 : 두 정수 입력받아 큰 수 출력하기

package questions;

import java.util.Scanner;

public class q_063 {

	public static void main(String[] args) {

		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a>b ? a:b);

	}

}
