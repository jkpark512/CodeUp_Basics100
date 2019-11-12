// 기초 입출력 : 정수 1개 입력받아 3번 출력하기

package questions;

import java.util.Scanner;

public class q_017 {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		for(int i=1; i<4; i++) {
			System.out.print(a);
			for(int j=i-1; j<i; j++) {
				System.out.print(" ");
			}
		}

	}

}

/*
public class q_016 {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		System.out.println(a+" "+a+" "+a);

	}

}

-------------------------------------------------------
문제해결하기 

for(int i=1; i<4; i++) {
			System.out.print(a);
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
		}
		
23
23 23  23  

답: j가 for문 안에서 0으로 다시 초기화가 된다는 점.
*/