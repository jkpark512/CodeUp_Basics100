// 기초 논리연산 : 참 거짓 바꾸기

package questions;

import java.util.Scanner;

public class q_053 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		boolean intToBool = !(input==1);
		
		int boolToInt = (intToBool)? 1:0;
		
		System.out.println(boolToInt);
		
	}

}
