// 기초 데이터형 : 실수 1개 입력받아 그대로 출력하기2

package questions;

import java.util.Scanner;

public class q_029 {

	public static void main(String[] args) {
		
		double input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextDouble();
		
		System.out.println(String.format("%.11f", input));

	}

}

// System.out.println(Double.parseDouble(String.format("%.11f", input)));
// 위의 라인은 에러난 것.