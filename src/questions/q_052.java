// 기초 비교연산 : 두 정수 입력받아 비교하기4

package questions;

import java.util.Scanner;

public class q_052 {

	public static void main(String[] args) {

		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a != b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
