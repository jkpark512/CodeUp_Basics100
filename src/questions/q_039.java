// 기초 산술연산 : 정수 2개 입력받아 합 출력하기2

package questions;

import java.util.Scanner;

public class q_039 {

	public static void main(String[] args) {
		
		long input1;
		long input2;
		long output;
		
		Scanner sc = new Scanner(System.in);
		
		input1 = sc.nextLong()
		input2 = sc.nextLong();
		
		output = input1+input2;
		
		System.out.println(output);
		

	}

}
