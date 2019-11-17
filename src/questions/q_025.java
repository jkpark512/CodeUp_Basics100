// 기초 입출력 : 정수 1개 입력받아 나누어 출력하기

package questions;

import java.util.Scanner;

public class q_025 {

	public static void main(String[] args) {
		
		int inputValue;
		
		Scanner sc = new Scanner(System.in);
		inputValue = sc.nextInt();
		
		int ans;
		int[] rem = {0,0,0,0,0};
		int[] disp = {0,0,0,0,0};
		
		for(int i=0; i<5; i++) {
			
			ans = inputValue/10;
			rem[i] = inputValue%10;
			disp[i] = (int) (rem[i]*Math.pow(10, i));
			inputValue = ans;
			
		} 
		
		for(int i=4; i>=0; i--) {
			System.out.println("["+disp[i]+"]");
		}
	}

}

/*
	int[] rem = null;
	int[] disp = null;
	
	int[] rem = {0,0,0,0,0};
	int[] disp = {0,0,0,0,0};
	
	위를 아래와 같이 바꾸니 NullPointerException 에러가 사라졌다. 
	
	이유를 알아보도록 하자. 
	
	+
	
	disp[i] = rem[i]*Math.pow(10, i);
	
	disp[i] = (int) (rem[i]*Math.pow(10, i));
	
	위를 아래와 같이 바꾸니 에러가 사라졌다. 
	
	이유를 알아보도록 하자. 
*/