// 기초 입출력 : 정수 1개 입력받아 나누어 출력하기

package questions;

import java.util.Scanner;

public class q_025 {

	public static void main(String[] args) {
		
		int inputValue;
		
		Scanner sc = new Scanner(System.in);
		inputValue = sc.nextInt();
		
		int ans;
		int[] rem = null;
		int[] disp = null;
		
		for(int i=0; i<5; i++) {
			
			ans = inputValue/10;
			rem[i] = inputValue%10;
			disp[i] = rem[i]*(10^(i-1));
			
		} 
		
		for(int i=4; i<0; i--) {
			System.out.println("["+disp[i]+"]");
		}
	}

}
