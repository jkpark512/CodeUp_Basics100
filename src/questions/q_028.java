// 기초 데이터형 : 정수 1개 입력받아 그대로 출력하기2

package questions;

import java.util.Scanner;

public class q_028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long inputValue = sc.nextLong();
		
		System.out.println(inputValue);

	}

}

// JAVA에서는 C, C++ 처럼 unsigned가 없다. 
// Java 8에는 Integer, Long 클래스의 메소드로 unsigned type을 지원한다. 
// unsigned는 C/C++ 언어에서 사용되는 지정자로 정수형과 같이 사용되어 부호비트를 제거해 저장 가능한 양수 범위를 두 배로 늘이는 역할을 한다.
