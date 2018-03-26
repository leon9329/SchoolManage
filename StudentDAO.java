import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Student DAO
public class StudentDAO{
	ArrayList<StudentDTO> stuList = new ArrayList<StudentDTO>();
	Set<String> stuID = new HashSet<>();
	
	
	StudentDAO(){//����Ʈ �л� + id ����Ʈ ��� = 1111
		stuList.add(new StudentDTO("a","1","ȫ�浿","��","20","����"));
		stuID.add("a");
		stuList.add(new StudentDTO("b","2","���켺","��","26","����"));
		stuID.add("b");
		stuList.add(new StudentDTO("c","3","������","��","25","����"));
		stuID.add("c");
		stuList.add(new StudentDTO("d","4","������","��","24","����"));
		stuID.add("d");
		stuList.add(new StudentDTO("e","5","Ȳ�켮","��","23","����"));
		stuID.add("e");		
	}
	
	Scanner sc = new Scanner(System.in);
	
	void StudentBoard() {// �����ڰ� �л� ����

		while (true) {
			System.out.println("1.�л� �߰� 2.�л� ����Ʈ 3.�л� ���� 4.�л� ���� ���� 5.�ڷ�");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				AddStudent();
				break;
			case "2":
				System.out.println("�й�	�̸�	����	����	�����ϴ°���");
				System.out.println("------------------------------------------");
				for (int i = 0; i < stuList.size(); i++) 
					showStudent(stuList.get(i));
				System.out.println("------------------------------------------");
				System.out.println();
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
	
	boolean CheckID(String id) {	//�α��ν� idȮ��
		Iterator<String> iterator = stuID.iterator();
		while(iterator.hasNext()) {
			if(id.equals(iterator.next())) {
				return true;
			}else
				return false;
		}
		return false;		
	}
	

	
	/*	void SelfUpdateStudent(StudentDTO student) {	//�л� ������ ��������
	System.out.println("������ �����Ͻðڽ��ϱ�?");
	System.out.println("1.�й� 2.�̸� 3.���� 4.���� 5.�����ϴ� ����");
	String n = sc.nextLine();
	switch (n) {
	case "1":
		student.setClassOf(sc.nextLine());
		break;
	case "2":
		student.setName(sc.nextLine());
		break;
	case "3":
		student.setAge(sc.nextLine());
		break;
	case "4":
		student.setPrivateCourse(sc.nextLine());
		break;
	default:	
		System.out.println("1~5���� �����ϼ���.");
		break;
	}
	
}*/
	

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

		stuList.add(new StudentDTO(classOf, name, sex, age, privateSubject));
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
	

	
	void showStudent(StudentDTO student) {
		System.out.println(student.getClassOf() + "	" + student.getName() + "	" 
				+ student.getSex() + "	" + student.getAge() + "	"  + student.getPrivateCouse());
	}
}