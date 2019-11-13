// 기초 입출력 : 단어 1개 입력받아 그대로 출력하기

// (한 단어가 입력되는데, 단어의 길이는 50자 이하로 제한한다.)

package questions;

import java.util.Scanner;

public class q_021 {

	public static void main(String[] args) {
		
		String inputLine;
		int lineLength;
		
		Scanner sc = new Scanner(System.in);
		
		inputLine = sc.nextLine();
		lineLength = inputLine.length();
		
		while(lineLength>50) {
			System.out.println("단어 길이가 50자 초과입니다. 다시 입력하세요.");
			inputLine = sc.nextLine();
			lineLength = inputLine.length();
		}
		
		System.out.println(inputLine);
		
	}

}
