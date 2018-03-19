package a2018_03_19;

import java.util.Scanner;

public class VerifyRegistrationNum {

	String s; // String 주민번호 각 자리
	int n; // int 주민번호 각 자리
	int sum = 0; // 각 자리수와 해당 숫자를 곱한뒤 모두 더한 값 저장
	int result; // 체크값과 비교할 값
	int j = 2; // 각 자리에 곱할 수

	boolean checkJumin(String jumin) { // 타당한 주민번호인지 판별

		for (int i = 0; i < jumin.length() - 1; i++) {

			s = jumin.substring(i, i + 1);
			n = Integer.parseInt(s);

			sum += (n * j);

			if (j == 9)
				j = 1;
			j++;

		}

		result = 11 - (sum % 11);
		if (result >= 10)
			result %= 10;

		if (result == Integer.parseInt(jumin.substring(12, 13)))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerifyRegistrationNum homeWork01 = new VerifyRegistrationNum();
		boolean check;
		String jumin1, jumin2;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("앞 6자리 입력 : ");
			jumin1 = sc.nextLine();
			if (jumin1.length() == 6)
				break;
			System.out.println("*6자리를 입력하세요*");
		}

		while (true) {
			System.out.println("뒤 7자리 입력 : ");
			jumin2 = sc.nextLine();
			if (jumin2.length() == 7)
				break;
			System.out.println("*7자리를 입력하세요*");
		}

		String jumin = jumin1 + jumin2;
		// 000000-0000000

		System.out.println(jumin1 + "-" + jumin2);

		if (check = homeWork01.checkJumin(jumin)) {
			if (jumin.substring(5, 6).equals("1") || jumin.substring(5, 6).equals("3")) {
				System.out.println("남자 입니다.");
			} else if (jumin.substring(5, 6).equals("2") || jumin.substring(5, 6).equals("4")) {
				System.out.println("여자 입니다.");
			} else {
				System.out.println("잘못된 주민번호 입니다.");
			}
		}else
			System.out.println("유효한 주민번호가 아닙니다.");
	}
}
