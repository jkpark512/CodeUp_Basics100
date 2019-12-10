// 기초 출력변환 : 정수 입력받아 아스키 문자로 출력하기

package questions;

import java.util.Scanner;

public class q_037 {

	public static void main(String[] args) {
		
		int input;
		char output;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		output = (char) input;
		
		System.out.println(output);

	}

}
