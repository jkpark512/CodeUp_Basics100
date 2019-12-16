// 기초 종합 : 주사위를 2개 던지면?

package questions;

import java.util.Scanner;

public class q_081 {

	public static void main(String[] args) {
		
		int n;
		int m;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.println(i+" "+j);
			}
		}

	}

}
