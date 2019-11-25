// 기초 산술연산 : 문자 1개 입력받아 다음 문자 출력하기

package questions;

import java.util.Scanner;

public class q_041 {

	public static void main(String[] args) {
		
		char input;
		char output = 0;
		int changeInput = 0;
		int outputNum;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine().charAt(0);
		changeInput = (int)input;
		outputNum = changeInput+1;
		output = (char)outputNum;
		
		System.out.println(output);
	}

}

// 숫자 -> 문자, 문자 -> 숫자
// 18번 줄을 다시 잘 보자. 