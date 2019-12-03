// 기초 반복실행구조 : 0 입력될 때까지 무한 출력하기1

package questions;

import java.util.Arrays;
import java.util.Scanner;

public class q_071 {

	public static void main(String[] args) {
		
		int[] arrayInt = {0,0,0};
		String[] arrayString;
		String line;
		
		Scanner sc = new Scanner(System.in);
		
		line = sc.nextLine();
		arrayString = line.split(" ");
		arrayInt = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
		
		while(arrayInt != null) {
			
			for(int i=0; i<i+2; i++) {
				
				System.out.println(arrayInt[i]);
				
				if(arrayInt[i] == 0) 
					break;
	
			}
			
		}
	}

}
