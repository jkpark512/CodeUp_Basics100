// 기초 조건/선택실행구조 : 정수 1개 입력받아 평가 출력하기

package questions;

import java.util.Scanner;

public class q_068 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		if(input>=90) {
			System.out.println("A");
		}else if(input>=70) {
			System.out.println("B");
		}else if(input>=40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}

	}

}
