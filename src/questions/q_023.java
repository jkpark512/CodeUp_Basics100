// 기초 입출력 : 실수 1개 입력받아 부분별로 출력하기

package questions;

import java.util.Scanner;

public class q_023 {

	public static void main(String[] args) {
		
		double inputDouble;
		String doubleTOstring;
		String[] array;
		
		Scanner sc = new Scanner(System.in);
		
		inputDouble = sc.nextDouble();
		doubleTOstring = Double.toString(inputDouble);
		array = doubleTOstring.split("\\.");
		
		System.out.println(array[0]);
		System.out.println(array[1]);
	}

}

// line 19 다시보기

/*

출처 : https://mytory.net/archives/285

split의 인자로 들어가는 String 토큰이 regex 정규식이기 때문이다. 
정규식에서 .은 무작위의 한 글자를 의미한다. 
그러면 모든 문자가 토큰이 되기 때문에 배열에 남는 게 없게 되는 것이다.

따라서 이스케이프 문자를 앞에 붙여 줘야 한다. 
그런데 String 안에 이스케이프 문자인 \를 써 주려면 \\라고 써 줘야 한다. 따라서 \\라고 쓰는 것이다. 
그래서 \\.이라고 쓰면 정규식 쪽에서는 \.라고 인식을 하고 실제 .을 찾게 되는 것이다.

기호를 써서 split를 쓸 때 뭔가 작동을 안 하면 \\을 붙여 보라.

그냥 \라고만 붙여야 하는 것도 있는데 아래와 같다. 
\b \t \n \f \r \" \' \\

*/