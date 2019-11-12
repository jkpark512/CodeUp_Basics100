// 기초 입출력 : 연월일 입력받아 그대로 출력하기

package questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class q_019 {

	public static void main(String[] args) throws ParseException {
		
		String InputDate;
		Date OutputDate;
		String OutputDateSTR;
		
		Scanner sc = new Scanner(System.in);
		
		InputDate = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		OutputDate = sdf.parse(InputDate);
		OutputDateSTR = sdf.format(OutputDate);

		System.out.println(OutputDateSTR);
	}

}

// Date to String
// String to Date
// 위의 두 가지에 관해서 모두 들어있으므로 주의하여 보자.

