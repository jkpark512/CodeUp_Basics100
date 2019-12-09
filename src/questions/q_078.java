// 기초 종합 : 짝수 합 구하기

package questions;

import java.util.Scanner;

public class q_078 {

	public static void main(String[] args) {
		
		int inputValue;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		inputValue = sc.nextInt();
		
		for(int i=1; 2*i<=inputValue; i++) {
			
			int even = 2*i;
			sum = even+sum;
			
		}
		
		System.out.println(sum);

	}

}
