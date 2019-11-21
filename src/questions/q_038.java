// 기초 산술연산 : 정수 2개 입력받아 합 출력하기1

package questions;

import java.util.Scanner;

public class q_038 {

	public static void main(String[] args) {
	
		String inputValueLine;
		String[] array;
		long inputValue1;
		long inputValue2;
		long sum;
		
		Scanner sc = new Scanner(System.in);
		
		inputValueLine = sc.nextLine();
		array = inputValueLine.split(" ");
		inputValue1 = Integer.parseInt(array[0]);
		inputValue2 = Integer.parseInt(array[1]);
		sum = (inputValue1)+(inputValue2);
		
		System.out.println(sum);
		
	}

}

/*
	1073741824 1073741824
		-2147483648
		
	inputValue1과 inputValue2를 int로 설정하고,
	sum을 long으로 설정했을 경우에 났던 오류이다. 
	
	계산 결과가 이미 오버플로우로 인해 에러가 났기 때문에
	데이터 저장형을 long으로 해도 오류를 피할 수 없다. 
*/