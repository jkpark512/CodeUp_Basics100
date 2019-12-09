// 기초 출력변환 : 8진 정수 1개 입력받아 10진수로 출력하기

package questions;

import java.util.Scanner;

public class q_034 {

	public static void main(String[] args) {
		
		String input;
		int output;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine();
		output = Integer.parseInt(input, 8);
		
		System.out.println(output);

	}

}
