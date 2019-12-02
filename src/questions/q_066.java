// 기초 조건/선택실행구조 : 정수 3개 입력받아 짝/홀 출력하기

package questions;

import java.util.Scanner;

public class q_066 {

	public static void main(String[] args) {
		
		int[] value = {0,0,0};
		
		Scanner sc = new Scanner(System.in);
		
		value[0] = sc.nextInt();
		value[1] = sc.nextInt();
		value[2] = sc.nextInt();
		
		for(int i=0; i<3; i++) {
			if(value[i]%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
		
	}

}
