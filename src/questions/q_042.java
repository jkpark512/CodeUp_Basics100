// 기초 산술연산 : 정수 2개 입력받아 나눈 몫 출력하기

package questions;

import java.util.Scanner;

public class q_042 {

	public static void main(String[] args) {
	
		int dividend = 0;
		int divisor = 0;
		int quotient;
		String[] array;
		String line;
		
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		array = line.split(" ");
		dividend = Integer.parseInt(array[0]);
		divisor = Integer.parseInt(array[1]);
		
		quotient = dividend/divisor;
		
		System.out.println(quotient);

	}

}
