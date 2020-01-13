// 기초 종합 : 함께 문제 푸는 날

package questions;

import java.util.Scanner;

public class q_092 {

	public static void main(String[] args) {
		
		int human1, human2, human3;
		int day = 1;
		
		Scanner sc = new Scanner(System.in);
		
		human1 = sc.nextInt();
		human2 = sc.nextInt();
		human3 = sc.nextInt();
		
		while(day%human1 != 0 || day%human2 != 0 || day%human3 != 0) {
			day++;
		}
		
		System.out.println(day);
		

	}

}
