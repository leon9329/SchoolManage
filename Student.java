import java.util.Scanner;

public class Student {
//test	
	Scanner sc = new Scanner(System.in);

	private String classOf; // �й�
	private String name; // �̸�
	private String sex; // ����
	private String age; // ����
	private String privateCourse; // �����ϴ� ����

	Student() {

	}

	Student(String classOf, String name, String sex, String age, String privateCourse) {
		this.classOf = classOf;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.privateCourse = privateCourse;

	}

	void AddStudent() { // �л� �߰� �޼ҵ�

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

		SchoolMain.stuList.add(student);
	}

	boolean deleteStudent() { // �л� ���� �޼ҵ�
		System.out.println("������ �л� �й� : ");
		classOf = sc.nextLine();
		System.out.println("������ �л� �̸� : ");
		name = sc.nextLine();

		for (int i = 0; i < SchoolMain.stuList.size(); i++) {
			if (SchoolMain.stuList.get(i).getClassOf().equals(classOf)
					&& SchoolMain.stuList.get(i).getName().equals(name)) {
				SchoolMain.stuList.remove(i);
				return true;

			}

		}
		return false;
	}
	
	void ModifyStudent() {
		
		Student student = new Student();
		System.out.println("������ �л��� �й� : ");
		classOf = sc.nextLine();
		
		for(int i = 0; i < SchoolMain.stuList.size(); i++) {
			student = SchoolMain.stuList.get(i);
			if(!(student.classOf.equals(classOf))) {
				System.out.println("�ش� �й��� �л��� �����ϴ�.");
			}else {
				System.out.println("������ �л��� �̸� : ");
				name = sc.nextLine();
				if(!(student.name.equals(name))) {
					System.out.println("�ش� �̸��� �л��� �����ϴ�.");
				}else {
					System.out.println("������ �����Ͻðڽ��ϱ�?");
					System.out.println("1.�й� 2.�̸� 3.���� 4.���� 5.�����ϴ� ����");
					String s = sc.nextLine();
					switch(s) {
					case "1":
						System.out.println("���ο� �й�: ");
						classOf = sc.nextLine();
						student.setClassOf(classOf);
						System.out.println("���� �Ϸ�.");
						break;
					case "2":
						System.out.println("���ο� �̸�: ");
						name = sc.nextLine();
						student.setName(name);
						System.out.println("���� �Ϸ�.");
						break;
					case "3":
						if(student.sex.equals("��"))
							student.setSex("��");
						else
							student.setSex("��");
						System.out.println("���� �Ϸ�.");
						break;
					case "4":

						System.out.println("���ο� ����: ");
						age = sc.nextLine();
						student.setAge(age);
						System.out.println("���� �Ϸ�.");
						break;
					case "5":
						System.out.println("���� �����ϴ� ���� : ");
						privateCourse = sc.nextLine();
						student.setPrivateCourse(privateCourse);
						System.out.println("���� �Ϸ�.");
						break;
					default :
						System.out.println("1~5���� �����ϼ���.");
					
					}
				}
			} 
				
			
		}
		
		
	}

	public void StudentInfo() { // �л� ���� ���
		System.out.println(classOf + " " + name + " " + sex + " " + age + " " + privateCourse);
	}

	public void setClassOf(String classOf) {
		this.classOf = classOf;
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

	public void setPrivateCourse(String privateCourse) {
		this.privateCourse = privateCourse;
	}

	public String getClassOf() {
		return classOf;
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

	public String getPrivateCouse() {
		return privateCourse;
	}

}
