// 기초 입출력 : 정수 2개 입력받아 그대로 출력하기

package questions;

import java.util.Scanner;

public class q_013 {

	public static void main(String[] args) {
		
		int a;
		int b;
		String line;
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		String[] array = line.split(" ");
		
		a = Integer.parseInt(array[0]);
		b = Integer.parseInt(array[1]);
		
		System.out.println(a+" "+b);
		
	}

}

// split, trim 기억하기.

/* Enter를 이용하여 입력받기 

package questions;

import java.util.Scanner;

public class q_013 {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		
		System.out.println(a);
		System.out.println(b);
	}

}

*/

// String을 Int로 바꾸기.
// Enter 입력받기. 
// nextLine과 Enter.
