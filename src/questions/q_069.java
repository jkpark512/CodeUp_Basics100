// 기초 조건/선택실행구조 : 평가 입력받아 다르게 출력하기

package questions;

import java.util.Scanner;

public class q_069 {

	public static void main(String[] args) {
		
		String input;
		String output="";
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.next();
		
		switch(input) {
			case "A" : output="best!!!";
				break;
			case "B" : output="good!!";
				break;
			case "C" : output="run!";
				break;
			case "D" : output="slowly~";
				break;
			default : output="what?";
				break;
		}
		
		System.out.println(output);
		
	}

}
