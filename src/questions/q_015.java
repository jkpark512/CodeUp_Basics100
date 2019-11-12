// 기초 입출력 : 실수 입력받아 둘째 자리까지 출력하기

package questions;

import java.util.Scanner;

public class q_015 {

	public static void main(String[] args) {
		
		float a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextFloat();
		
		System.out.println(String.format("%.2f", a));

	}

}

// 반올림 문제이다. 
// String.format(형식, 표시할 것) 

