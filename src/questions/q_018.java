// 기초 입출력 : 시간 입력받아 그대로 출력하기

package questions;

import java.util.Scanner;

public class q_018 {

	public static void main(String[] args) {
		
		int h;
		int m;
		String[] array;
		String line;
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		array = line.split(":");
		
		System.out.println(array[0]+":"+array[1]);
		
	}

}
