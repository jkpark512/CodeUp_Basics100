// 기초 산술연산 : 정수 1개 입력받아 1 더해 출력하기

package questions;

import java.util.Scanner;

public class q_044 {

	public static void main(String[] args) {
		
		long input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		System.out.println(input+1);
	}

}

// long과 int의 차이
// int input으로 하면 2147483647을 입력 시 -2147483648를 출력 함.