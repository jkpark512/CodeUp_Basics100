// 기초 논리연산 : 둘 다 거짓일 경우만 참 출력하기

package questions;

import java.util.Scanner;

public class q_058 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a==0 && b==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
