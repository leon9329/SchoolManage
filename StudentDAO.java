import java.util.ArrayList;
import java.util.Scanner;

//Student DAO
public class StudentDAO {
	ArrayList<StudentDTO> stuList = new ArrayList<StudentDTO>();
	
	StudentDAO(){
		stuList.add(new StudentDTO("1","ȫ�浿","��","20","����"));
		stuList.add(new StudentDTO("2","���켺","��","26","����"));
		stuList.add(new StudentDTO("3","������","��","25","����"));
		stuList.add(new StudentDTO("4","������","��","24","����"));
		stuList.add(new StudentDTO("5","Ȳ�켮","��","23","����"));
				
	}
	
	Scanner sc = new Scanner(System.in);
	

	void AddStudent() { // �л� �߰� �޼ҵ�

		System.out.print("�й� : ");
		String classOf = sc.nextLine();

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("���� : ");
		String sex = sc.nextLine();

		System.out.print("���� : ");
		String age = sc.nextLine();

		System.out.print("�����ϴ� ���� : ");
		String privateSubject = sc.nextLine();

		StudentDTO student = new StudentDTO(classOf, name, sex, age, privateSubject);

		stuList.add(student);
	}

	void StudentBoard() {// �л� ����

		while (true) {
			System.out.println("1.�л� �߰� 2.�л� ����Ʈ 3.�л� ���� 4.�л� ���� ���� 5.�ڷ�");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				AddStudent();
				break;
			case "2":
				for (int i = 0; i < stuList.size(); i++)
					stuList.get(i).StudentInfo();
				break;
			case "3":
				if (deleteStudent())
					System.out.println("���� �Ϸ�");
				else
					System.out.println("���� ����");
				break;
			case "4":
				CheckStudent();
				break;
			case "5":
				return;
			}
		}

	}

	boolean deleteStudent() { // �л� ���� �޼ҵ�
		System.out.println("������ �л� �й� : ");
		String classOf = sc.nextLine();
		System.out.println("������ �л� �̸� : ");
		String name = sc.nextLine();

		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getClassOf().equals(classOf) && stuList.get(i).getName().equals(name)) {
				stuList.remove(i);
				return true;

			}

		}
		return false;
	}

	void CheckStudent() { // ���� �л� �й�, �̸� Ȯ��

		System.out.println("������ �л��� �й� : ");
		String classOf = sc.nextLine();
		System.out.println("������ �л� �̸� : ");
		String name = sc.nextLine();

		for (int i = 0; i < stuList.size(); i++) {
			StudentDTO student = stuList.get(i);
			if (student.getClassOf().equals(classOf) && student.getName().equals(name)) {
				UpdateStudent(student);
				return;
			}
			System.out.println("student.getClassOf = " + student.getClassOf());
			System.out.println("student.getName = " + student.getName());
			System.out.println();
			
		}
		System.out.println("�й� �Ǵ� �̸��� �߸�����ϴ�.");
	}

	
	void UpdateStudent(StudentDTO student) {	//�л� ����
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		System.out.println("1.�й� 2.�̸� 3.���� 4.���� 5.�����ϴ� ����");
		String s = sc.nextLine();
		switch (s) {
		case "1":
			System.out.println("���ο� �й�: ");
			student.setClassOf(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		case "2":
			System.out.println("���ο� �̸�: ");
			student.setName(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		case "3":
			if (student.getSex().equals("��"))
				student.setSex("��");
			else
				student.setSex("��");
			System.out.println("���� �Ϸ�.");
			break;
		case "4":

			System.out.println("���ο� ����: ");
			student.setAge(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		case "5":
			System.out.println("���� �����ϴ� ���� : ");
			student.setPrivateCourse(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		default:
			System.out.println("1~5���� �����ϼ���.");

		}

	}
}