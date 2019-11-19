// 기초 출력변환 : 10진 정수 1개 입력받아 8진수로 출력하기

package questions;

import java.util.Scanner;

public class q_031 {

	public static void main(String[] args) {
		
		int inputInt;
		String outputInt;
		
		Scanner sc = new Scanner(System.in);
		
		inputInt = sc.nextInt();
		
		outputInt = Integer.toOctalString(inputInt);
		
		System.out.println(outputInt);
	
	}

}
