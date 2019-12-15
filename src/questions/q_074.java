// 기초 반복실행구조 : 정수 1개 입력받아 카운트다운 출력하기1

package questions;

import java.util.Scanner;

public class q_074 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		while(input>=1) {
			
			System.out.println(input);
			input = input-1;
			
		}
	}

}
