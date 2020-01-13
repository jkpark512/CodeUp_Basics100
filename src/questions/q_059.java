// 기초 비트단위논리연산 : 비트단위로 NOT 하여 출력하기

package questions;

import java.util.Scanner;

public class q_059 {

	public static void main(String[] args) {
		
		int input;
		int convert;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		convert = ~input;
		
		System.out.println(convert);

	}

}
