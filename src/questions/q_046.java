// 기초 산술연산 : 정수 3개 입력받아 합과 평균 출력하기

package questions;

import java.util.Scanner;

public class q_046 {

	public static void main(String[] args) {
		
		int first;
		int second;
		int third;
		int sum;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		first = sc.nextInt();
		second = sc.nextInt();
		third = sc.nextInt();
		
		sum = first+second+third;
		avg = (float) sum/3;
		
		System.out.println(sum);
		System.out.println(String.format("%.1f",avg));
		
	}

}
