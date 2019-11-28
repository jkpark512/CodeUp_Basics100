// 기초 비교연산 : 두 정수 입력받아 비교하기1

package questions;

import java.util.Scanner;

public class q_049 {

	public static void main(String[] args) {
		
		int input1;
		int input2;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		System.out.println(result = input1>input2 ? 1 : 0);

	}

}
