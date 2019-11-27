// 기초 산술연산 : 정수 2개 입력받아 나눈 나머지 출력하기

package questions;

import java.util.Scanner;

public class q_043 {

	public static void main(String[] args) {
		
		int dividend;
		int divisor;
		int remainder;
		String line;
		String[] array;
		
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		array = line.split(" ");
		dividend = Integer.parseInt(array[0]);
		divisor = Integer.parseInt(array[1]);
		remainder = dividend%divisor;
		
		System.out.println(remainder);

	}

}

// String -> Int 기억하자!
// 매번 같은 패턴으로만 푸는 것은 아닌지. 
// 다른 방식도 생각해보자. 
