// 기초 비트시프트연산 : 한 번에 2의 거듭제곱 배로 출력하기

package questions;

import java.util.Scanner;

public class q_048 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int output;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		output = a<<b;
		
		System.out.println(output);
	}

}
