import java.util.Scanner;

public class ManagerMethod {

	Scanner sc = new Scanner(System.in);
	
	
	void ManagerView() {	//�����ڸ�� ȭ��
		while (true) {
			System.out.println("1.�л� ���� 2.���� ���� 3.�α׾ƿ� ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				SchoolMain.student.StudentBoard();
				break;
			case "2":
				SchoolMain.professor.ProfessorBoard();
				break;
			case "3":
				return;
			}
		}
	}
}
