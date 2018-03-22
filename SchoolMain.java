import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//����
public class SchoolMain {
	static List<Student> stuList = new ArrayList<Student>();
	static List<Professor> proList = new ArrayList<Professor>();
	static String classOf, name, sex, privateCourse, age;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();

		while (true) {
			System.out.println("1.�л� ���� 2.���� ���� 3.���� ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				main.StudentBoard();
				break;
			case "2":
				main.ProfessorBoard();
				break;
			case "3":
				System.out.println("���� �Ǿ����ϴ�.");
				return;
			}
		}

	}

	void StudentBoard() {//�л� ����

		Student student = new Student();

		while (true) {
			System.out.println("1.�л� �߰� 2.�л� ����Ʈ 3.�л� ���� 4.�л� ���� ���� 5.�ڷ�");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				student.AddStudent();
				break;
			case "2":
				for (int i = 0; i < stuList.size(); i++)
					stuList.get(i).StudentInfo();
				break;
			case "3":
				if (student.deleteStudent())
					System.out.println("���� �Ϸ�");
				else
					System.out.println("���� ����");
				break;
			case "4":
				student.ModifyStudent();
				break;
			case "5":
				return;
			}
		}

	}

	void ProfessorBoard() {	//���� ����

		Professor professor = new Professor();

		while (true) {
			System.out.println("1.���� �߰� 2.���� ����Ʈ 3.���� ���� 4.������ ���� 5.�ڷ�");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				professor.AddProfessor();
				break;
			case "2":
				for (int i = 0; i < proList.size(); i++)
					proList.get(i).ProfessorInfo();
				break;
			case "3":
				if (professor.deleteProfessor())
					System.out.println("���� �Ϸ�");
				else
					System.out.println("���� ����");
				break;
			case "4":
				professor.ModifyProfessor();
				break;
			case "5":
				return;
			}
		}

	}

}
