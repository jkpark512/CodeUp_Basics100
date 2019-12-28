// 기초 종합 : 수 나열하기3

package questions;

import java.util.Scanner;

public class q_091 {

	public static void main(String[] args) {
		
		long a;
		long m;
		long d;
		long n;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLong();
		m = sc.nextLong();
		d = sc.nextLong();
		n = sc.nextLong();
		
		for(int k=1; k<n; k++) {
			
			a=a*m+d;
			
		}
		
		System.out.println(a);

	}

}
