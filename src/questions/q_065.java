// 기초 조건/선택실행구조 : 정수 3개 입력받아 짝수만 출력하기

package questions;

import java.util.Scanner;

public class q_065 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		}
		
		if(b%2==0) {
			System.out.println(b);
		}
		
		if(c%2==0) {
			System.out.println(c);
		}
		
	}

}
