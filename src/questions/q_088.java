// 기초 종합 : 3의 배수는 통과?

package questions;

import java.util.Scanner;

public class q_088 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(i%3==0)
				continue;
			
			System.out.print(i+" ");
			
		}
	}

}

// continue문은 반복문 전체를 벗어나지 않고 다음 반복을 계속 수행한다는 점이 break문과 다르다. 
// 주로 if문과 함께 사용되어 특정 조건을 만족하는 경우에 continue문 이후의 문장들을 수행하지 않고 다음 반복으로 넘어가서 계속 진행하도록 한다. 
// 전체 반복 중에 특정조건을 만족하는 경우를 제외하고자 할 때 유용하다. 
