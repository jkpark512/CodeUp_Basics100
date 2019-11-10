// 기초 입출력 : 실수 1개 입력받아 그대로 출력하기

package questions;

import java.util.Scanner;

public class q_012 {

	public static void main(String[] args) {
		
		float a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextFloat();
		
		System.out.println(String.format("%.6f", a));

	}

}

// String.format("%.6f", a) 
// 위의 라인을 다시 볼 것.