// 기초 출력변환 : 영문자 1개 입력받아 10진수로 출력하기

package questions;

import java.util.Scanner;

public class q_036 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char input = sc.nextLine().charAt(0);
		
		int output = (int)input;
		
		System.out.println(output);

	}

}
