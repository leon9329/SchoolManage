package a2018_03_19;

import java.util.Scanner;

public class VerifyRegistrationNum {

	String s; // String �ֹι�ȣ �� �ڸ�
	int n; // int �ֹι�ȣ �� �ڸ�
	int sum = 0; // �� �ڸ����� �ش� ���ڸ� ���ѵ� ��� ���� �� ����
	int result; // üũ���� ���� ��
	int j = 2; // �� �ڸ��� ���� ��

	boolean checkJumin(String jumin) { // Ÿ���� �ֹι�ȣ���� �Ǻ�

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
			System.out.println("�� 6�ڸ� �Է� : ");
			jumin1 = sc.nextLine();
			if (jumin1.length() == 6)
				break;
			System.out.println("*6�ڸ��� �Է��ϼ���*");
		}

		while (true) {
			System.out.println("�� 7�ڸ� �Է� : ");
			jumin2 = sc.nextLine();
			if (jumin2.length() == 7)
				break;
			System.out.println("*7�ڸ��� �Է��ϼ���*");
		}

		String jumin = jumin1 + jumin2;
		// 000000-0000000

		System.out.println(jumin1 + "-" + jumin2);

		if (check = homeWork01.checkJumin(jumin)) {
			if (jumin.substring(5, 6).equals("1") || jumin.substring(5, 6).equals("3")) {
				System.out.println("���� �Դϴ�.");
			} else if (jumin.substring(5, 6).equals("2") || jumin.substring(5, 6).equals("4")) {
				System.out.println("���� �Դϴ�.");
			} else {
				System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
			}
		}else
			System.out.println("��ȿ�� �ֹι�ȣ�� �ƴմϴ�.");
	}
}
