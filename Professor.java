import java.util.Scanner;
//test
public class Professor {
	private String name;
	private String sex;
	private String age;
	private String subject;

	Scanner sc = new Scanner(System.in);

	Professor() {

	}

	Professor(String name, String sex, String age, String subject) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.subject = subject;

	}

	void AddProfessor() { // ���� �߰� �޼ҵ�

		Professor professor = new Professor();

		System.out.print("�̸� : ");
		name = sc.nextLine();
		professor.setName(name);

		System.out.print("���� : ");
		sex = sc.nextLine();
		professor.setSex(sex);

		System.out.print("���� : ");
		age = sc.nextLine();
		professor.setAge(age);

		System.out.print("���� ���� : ");
		subject = sc.nextLine();
		professor.setSubject(subject);

		SchoolMain.proList.add(professor);
	}

	public void ProfessorInfo() { // ���� ���� ���
		System.out.println(name + " " + sex + " " + age + " " + subject);
	}

	boolean deleteProfessor() { // ���� ���� �޼ҵ�

		System.out.println("������ ���� �̸� : ");
		name = sc.nextLine();

		System.out.println("������ ������ ������ : ");
		subject = sc.nextLine();

		for (int i = 0; i < SchoolMain.proList.size(); i++) {
			System.out.println(SchoolMain.proList.size());
			if (SchoolMain.proList.get(i).getSubject().equals(subject)
					&& SchoolMain.proList.get(i).getName().equals(name)) {
				SchoolMain.proList.remove(i);
				return true;
			}

		}
		return false;
	}

	void ModifyProfessor() { // ���� ����

		Professor professor = new Professor();
		System.out.println("������ ������ �̸� : ");
		name = sc.nextLine();

		for (int i = 0; i < SchoolMain.proList.size(); i++) {
			professor = SchoolMain.proList.get(i);
			if (!(professor.name.equals(name))) {
				System.out.println("�ش� �̸��� ������ �����ϴ�.");
			} else {
				System.out.println("���� ���� : ");
				subject = sc.nextLine();
				if (!(professor.subject.equals(subject))) {
					System.out.println("�ش� ������ ������ �����ϴ�.");
				} else {
					System.out.println("������ �����Ͻðڽ��ϱ�?");
					System.out.println("1.�̸� 2.���� 3.���� 4.���� ����");
					String s = sc.nextLine();
					switch (s) {
					case "1":
						System.out.println("���ο� �̸�: ");
						name = sc.nextLine();
						professor.setName(name);
						System.out.println("���� �Ϸ�.");
						break;
					case "2":
						if (professor.sex.equals("��"))
							professor.setSex("��");
						else
							professor.setSex("��");
						System.out.println("���� �Ϸ�.");
						break;
					case "3":
						System.out.println("������ ����: ");
						age = sc.nextLine();
						professor.setAge(age);
						System.out.println("���� �Ϸ�.");
						break;
					case "4":

						System.out.println("���ο� ����: ");
						subject = sc.nextLine();
						professor.setSubject(subject);
						System.out.println("���� �Ϸ�.");
						break;
					default:
						System.out.println("1~4���� �����ϼ���.");

					}
				}
			}

		}

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getAge() {
		return age;
	}

	public String getSubject() {
		return subject;
	}

}
