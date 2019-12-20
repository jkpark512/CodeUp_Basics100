// 기초 삼항연산 : 정수 3개 입력받아 가장 작은 수 출력하기

package questions;

import java.util.Scanner;

public class q_064 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int min = (a>b? b:a)>c? c:(a>b? b:a);
		
		System.out.println(min);

	}

}
