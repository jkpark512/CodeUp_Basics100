// 기초 종합 : 16진수 구구단?

package questions;

import java.util.Scanner;

public class q_082 {

	public static void main(String[] args) {
		
		String input;
		int HexToTen;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.next();
		HexToTen = Integer.valueOf(input, 16);
		
		for(int i=1; i<16; i++) {
			
			int output = HexToTen*i;
			String iToHex = String.format("%X", i);
			String outputToHex = String.format("%X",output);
	
			System.out.println(input+"*"+iToHex+"="+outputToHex);
		}
		
	}

}
