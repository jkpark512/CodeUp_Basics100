// 기초 논리연산 : 참/거짓이 서로 같을 때에만 참 출력하기

package questions;

import java.util.Scanner;

public class q_057 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a==b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
