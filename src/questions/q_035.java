// 기초 출력변환 : 16진 정수 1개 입력받아 8진수로 출력하기

package questions;

import java.util.Scanner;

public class q_035 {

	public static void main(String[] args) {
		
		String input;
		int inputTo10;
		String output;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine();
		inputTo10 = Integer.parseInt(input, 16);
		output = Integer.toOctalString(inputTo10);
		
		System.out.println(output);

	}

}
