import java.util.Scanner;

public class ManagerMethod {

	StudentDAO student = SchoolMain.student;
	Scanner sc = new Scanner(System.in);
	
	
	void ManagerView() {	//관리자모드 화면
		while (true) {
			System.out.println("1.학생 관리 2.교수 관리 3.로그아웃 ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				StudentBoard();
				break;
			case "2":
				SchoolMain.professor.ProfessorBoard();
				break;
			case "3":
				return;
			}
		}
	}
	
	void StudentBoard() {// 관리자가 학생 관리

		while (true) {
			System.out.println("1.학생 추가 2.학생 리스트 3.학생 삭제 4.학생 정보 수정 5.뒤로");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				SchoolMain.student.AddStudent();
				break;
			case "2":
				System.out.println("학번	이름	성별	나이	수강");
				System.out.println("------------------------------------------");
				for (int i = 0; i < student.stuList.size(); i++)
					student.showStudent(student.stuList.get(i));
				System.out.println("------------------------------------------");
				System.out.println();
				break;
			case "3":
				if (student.deleteStudent())
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
				break;
			case "4":
				student.CheckStudent();
				break;
			case "5":
				return;
			}
		}

	}
}
