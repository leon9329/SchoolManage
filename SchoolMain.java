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
			System.out.println("1.학생 추가 2.학생리스트 3.학생 삭제 4.종료");
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
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
				break;
			case "4":
				System.out.println("종료 되었습니다.");
				return;
			}
		}

	}

	void AddStudent() { // 학생 추가
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

		stuList.add(student);
	}

	boolean deleteStudent() {
		System.out.println("삭제할 학생 학번 : ");
		classOf = sc.nextLine();
		System.out.println("삭제할 학생 이름 : ");
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
