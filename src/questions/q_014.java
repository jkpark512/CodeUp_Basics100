// 기초 입출력 : 문자 2개 입력받아 순서 바꿔 출력하기

package questions;

import java.util.Scanner;

public class q_014 {

	public static void main(String[] args) {
		
		char a;
		char b;
		String[] array;
		String line;
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		array = line.split(" ");
		
		a = array[0].charAt(0);
		b = array[1].charAt(0);
		
		System.out.println(b+" "+a);
		
	}

}

// 여러가지 변수 선언 알기
// 중간에 Enter가 두 번 들어감..?
// split한 문자는 배열에 들어가지 않는다. 
// split한 문자는 배열에 차례대로 들어간다. 
// String to char : a = array[0].charAt(0);
