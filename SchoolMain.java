import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();
		StudentDAO student = new StudentDAO();
		ProfessorDAO professor = new ProfessorDAO();
		
		
		System.out.println("1.�����ڸ�� 2.�л���� 3.�������");
		String a = sc.nextLine();
		
		while (true) {
			System.out.println("1.�л� ���� 2.���� ���� 3.���� ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				student.StudentBoard();
				break;
			case "2":
				professor.ProfessorBoard();
				break;
			case "3":
				System.out.println("���� �Ǿ����ϴ�.");
				return;
			}
		}

	}

	

	

}
