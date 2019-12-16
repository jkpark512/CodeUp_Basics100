// 기초 종합 : 3 6 9 게임의 왕이 되자!

package questions;

import java.util.Scanner;

public class q_083 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			
			if(i%3==0) {
				System.out.println("X");
			}else {
				System.out.println(i);
			}
		}

	}

}
