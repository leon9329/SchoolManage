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

	void AddProfessor() { // 교수 추가 메소드

		Professor professor = new Professor();

		System.out.print("이름 : ");
		name = sc.nextLine();
		professor.setName(name);

		System.out.print("성별 : ");
		sex = sc.nextLine();
		professor.setSex(sex);

		System.out.print("나이 : ");
		age = sc.nextLine();
		professor.setAge(age);

		System.out.print("전공 과목 : ");
		subject = sc.nextLine();
		professor.setSubject(subject);

		SchoolMain.proList.add(professor);
	}

	public void ProfessorInfo() { // 교수 정보 출력
		System.out.println(name + " " + sex + " " + age + " " + subject);
	}

	boolean deleteProfessor() { // 교수 삭제 메소드

		System.out.println("삭제할 교수 이름 : ");
		name = sc.nextLine();

		System.out.println("삭제할 교수의 교과목 : ");
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

	void ModifyProfessor() { // 교수 수정

		Professor professor = new Professor();
		System.out.println("수정할 교수의 이름 : ");
		name = sc.nextLine();

		for (int i = 0; i < SchoolMain.proList.size(); i++) {
			professor = SchoolMain.proList.get(i);
			if (!(professor.name.equals(name))) {
				System.out.println("해당 이름의 교수가 없습니다.");
			} else {
				System.out.println("전공 과목 : ");
				subject = sc.nextLine();
				if (!(professor.subject.equals(subject))) {
					System.out.println("해당 전공의 교수가 없습니다.");
				} else {
					System.out.println("무엇을 수정하시겠습니까?");
					System.out.println("1.이름 2.성별 3.나이 4.전공 과목");
					String s = sc.nextLine();
					switch (s) {
					case "1":
						System.out.println("새로운 이름: ");
						name = sc.nextLine();
						professor.setName(name);
						System.out.println("수정 완료.");
						break;
					case "2":
						if (professor.sex.equals("남"))
							professor.setSex("여");
						else
							professor.setSex("남");
						System.out.println("수정 완료.");
						break;
					case "3":
						System.out.println("수정할 나이: ");
						age = sc.nextLine();
						professor.setAge(age);
						System.out.println("수정 완료.");
						break;
					case "4":

						System.out.println("새로운 전공: ");
						subject = sc.nextLine();
						professor.setSubject(subject);
						System.out.println("수정 완료.");
						break;
					default:
						System.out.println("1~4번중 선택하세요.");

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
