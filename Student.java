import java.util.Scanner;

public class Student {
//test	
	Scanner sc = new Scanner(System.in);

	private String classOf; // 학번
	private String name; // 이름
	private String sex; // 성별
	private String age; // 나이
	private String privateCourse; // 좋아하는 과목

	Student() {

	}

	Student(String classOf, String name, String sex, String age, String privateCourse) {
		this.classOf = classOf;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.privateCourse = privateCourse;

	}

	void AddStudent() { // 학생 추가 메소드

		Student student = new Student();

		System.out.print("학번 : ");
		classOf = sc.nextLine();
		student.setClassOf(classOf);

		System.out.print("이름 : ");
		name = sc.nextLine();
		student.setName(name);

		System.out.print("성별 : ");
		sex = sc.nextLine();
		student.setSex(sex);

		System.out.print("나이 : ");
		age = sc.nextLine();
		student.setAge(age);

		System.out.print("좋아하는 과목 : ");
		privateCourse = sc.nextLine();
		student.setPrivateCourse(privateCourse);

		SchoolMain.stuList.add(student);
	}

	boolean deleteStudent() { // 학생 삭제 메소드
		System.out.println("삭제할 학생 학번 : ");
		classOf = sc.nextLine();
		System.out.println("삭제할 학생 이름 : ");
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
		System.out.println("수정할 학생의 학번 : ");
		classOf = sc.nextLine();
		
		for(int i = 0; i < SchoolMain.stuList.size(); i++) {
			student = SchoolMain.stuList.get(i);
			if(!(student.classOf.equals(classOf))) {
				System.out.println("해당 학번의 학생이 없습니다.");
			}else {
				System.out.println("수정할 학생의 이름 : ");
				name = sc.nextLine();
				if(!(student.name.equals(name))) {
					System.out.println("해당 이름의 학생이 없습니다.");
				}else {
					System.out.println("무엇을 수정하시겠습니까?");
					System.out.println("1.학번 2.이름 3.성별 4.나이 5.좋아하는 과목");
					String s = sc.nextLine();
					switch(s) {
					case "1":
						System.out.println("새로운 학번: ");
						classOf = sc.nextLine();
						student.setClassOf(classOf);
						System.out.println("수정 완료.");
						break;
					case "2":
						System.out.println("새로운 이름: ");
						name = sc.nextLine();
						student.setName(name);
						System.out.println("수정 완료.");
						break;
					case "3":
						if(student.sex.equals("남"))
							student.setSex("여");
						else
							student.setSex("남");
						System.out.println("수정 완료.");
						break;
					case "4":

						System.out.println("새로운 나이: ");
						age = sc.nextLine();
						student.setAge(age);
						System.out.println("수정 완료.");
						break;
					case "5":
						System.out.println("가장 좋아하는 과목 : ");
						privateCourse = sc.nextLine();
						student.setPrivateCourse(privateCourse);
						System.out.println("수정 완료.");
						break;
					default :
						System.out.println("1~5번중 선택하세요.");
					
					}
				}
			} 
				
			
		}
		
		
	}

	public void StudentInfo() { // 학생 정보 출력
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
