// 기초 입출력 : 주민번호 입력받아 형태 바꿔 출력하기

package questions;

import java.util.Scanner;

public class q_020 {

	public static void main(String[] args) {
		
		String line;
		String[] array;
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		array = line.split("-");
		
		System.out.println(array[0]+array[1]);
		
		
	}

}
