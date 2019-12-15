// 기초 산술연산 : 정수 2개 입력받아 자동 계산하기

package questions;

import java.util.Scanner;

public class q_045 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(Double.parseDouble(String.format("%.2f",(double) a / (double) b)));

	}

}

// 24번 째 라인
