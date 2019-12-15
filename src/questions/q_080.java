// 기초 종합 : 언제까지 더해야 할까?

package questions;

import java.util.Scanner;

public class q_080 {

	public static void main(String[] args) {

		int input;
		int i=1;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		while(i>0) {
				
				sum=sum+i;
				i=i+1;
				
			if(input<=sum) {
					
				System.out.println(i-1);
				i=0;
					
			}
			
		}
			
		

	}

}
