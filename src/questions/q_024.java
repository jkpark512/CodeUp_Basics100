// 기초 입출력 : 단어 1개 입력받아 나누어 출력하기

package questions;

import java.util.Scanner;

public class q_024 {

	public static void main(String[] args) {
		
		String inputVoca;
		int VocaLength;
		String[] array;
		
		Scanner sc = new Scanner(System.in);
		
		inputVoca = sc.nextLine();
		VocaLength = inputVoca.length();
		
		for(int i=0; i<VocaLength; i++) {
			array = inputVoca.charAt(i);
		}

	}

}
