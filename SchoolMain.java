import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//수정
public class SchoolMain {
	static List<Student> stuList = new ArrayList<Student>();
	static List<Professor> proList = new ArrayList<Professor>();
	static String classOf, name, sex, privateCourse, age;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();

		while (true) {
			System.out.println("1.학생 관리 2.교수 관리 3.종료 ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				main.StudentBoard();
				break;
			case "2":
				main.ProfessorBoard();
				break;
			case "3":
				System.out.println("종료 되었습니다.");
				return;
			}
		}

	}

	void StudentBoard() {//학생 관리

		Student student = new Student();

		while (true) {
			System.out.println("1.학생 추가 2.학생 리스트 3.학생 삭제 4.학생 정보 수정 5.뒤로");
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
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
				break;
			case "4":
				student.ModifyStudent();
				break;
			case "5":
				return;
			}
		}

	}

	void ProfessorBoard() {	//교수 관리

		Professor professor = new Professor();

		while (true) {
			System.out.println("1.교수 추가 2.교수 리스트 3.교수 삭제 4.교수진 수정 5.뒤로");
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
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
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
