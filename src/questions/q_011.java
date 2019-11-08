// 기초 입출력 : 문자 1개 입력받아 그대로 출력하기

package questions;

import java.util.Scanner;

public class q_011 {

	public static void main(String[] args) {
		
		char a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLine().charAt(0);
	
		System.out.println(a);
		
	}

}

// charAt()은 String을 char로 변환.
// nextLine과 next의 차이.
// https://colossus-java-practice.tistory.com/31 
// 위의 사이트 잠고하기. 
