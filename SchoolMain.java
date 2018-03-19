import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {
	static List<Student> stuList = new ArrayList<Student>();
	static String classOf, name, sex, privateCourse, age;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SchoolMain sm = new SchoolMain();

		while (true) {
			System.out.println("1.�л� �߰� 2.�л�����Ʈ 3.�л� ���� 4.����");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				sm.AddStudent();
				break;
			case "2":
				for (int i = 0; i < stuList.size(); i++)
					stuList.get(i).StudentInfo();
				break;
			case "3":
				if (sm.deleteStudent())
					System.out.println("���� �Ϸ�");
				else
					System.out.println("���� ����");
				break;
			case "4":
				System.out.println("���� �Ǿ����ϴ�.");
				return;
			}
		}

	}

	void AddStudent() { // �л� �߰�
		Student student = new Student();

		System.out.print("�й� : ");
		classOf = sc.nextLine();
		student.setClassOf(classOf);

		System.out.print("�̸� : ");
		name = sc.nextLine();
		student.setName(name);

		System.out.print("���� : ");
		sex = sc.nextLine();
		student.setSex(sex);

		System.out.print("���� : ");
		age = sc.nextLine();
		student.setAge(age);

		System.out.print("�����ϴ� ���� : ");
		privateCourse = sc.nextLine();
		student.setPrivateCourse(privateCourse);

		stuList.add(student);
	}

	boolean deleteStudent() {
		System.out.println("������ �л� �й� : ");
		classOf = sc.nextLine();
		System.out.println("������ �л� �̸� : ");
		name = sc.nextLine();

		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getClassOf().equals(classOf) && stuList.get(i).getName().equals(name)) {
				stuList.remove(i);
				return true;

			} else {
				return false;
			}

		}
		return false;
	}

}
