// 기초 조건/선택실행구조 : 정수 1개 입력받아 분석하기

package questions;

import java.util.Scanner;

public class q_067 {

	public static void main(String[] args) {
		
		int inputValue;
		
		Scanner sc = new Scanner(System.in);
		
		inputValue = sc.nextInt();
		
		if(inputValue>0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
		
		if(inputValue%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}

// 조건문의 중첩에 대해 알아보기.