// 기초 출력변환 : 10진 정수 입력받아 16진수로 출력하기2

package questions;

import java.util.Scanner;

public class q_033 {

	public static void main(String[] args) {
			
			int inputValue;
			String outputValue;
			
			Scanner sc = new Scanner(System.in);
			
			inputValue = sc.nextInt();
			outputValue = Integer.toHexString(inputValue);
			
			System.out.println(outputValue.toUpperCase());

	}

}
