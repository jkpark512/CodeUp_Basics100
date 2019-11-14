// 기초 입출력 : 문장 1개 입력받아 그대로 출력하기

package questions;

import java.util.Scanner;

public class q_022 {

	public static void main(String[] args) {
		
		String line;
		int lineLength;
		
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		lineLength = line.length();
		
		while(lineLength>2000) {
			System.out.println("2000자 이내로 입력 가능합니다.");
			lineLength = 0;
			
			line = sc.nextLine();
	
		}
		
		System.out.println(line);

	}

}
