// 기초 종합 : 수 나열하기1

package questions;

import java.util.Scanner;

public class q_089 {

	public static void main(String[] args) {
		
		int a;
		int d;
		int n;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		
		result = a+(n-1)*d;
		
		System.out.println(result);

	}

}
