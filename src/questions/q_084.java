// 기초 종합 : 빛 섞어 색 만들기

package questions;

public class q_084 {

	public static void main(String[] args) {
		
		int r,g,b;
		int n=0;
		
		for(r=0; r<=128; r++) {
			for(g=0; g<=128; g++) {
				for(b=0; b<=128; b++) {
					n++;
					System.out.println(r+" "+g+" "+b);
				}
			}
		}
		
		System.out.println(n);

	}

}
