import java.util.Scanner;

public class ManagerMethod {

	Scanner sc = new Scanner(System.in);
	
	
	void ManagerView() {	//관리자모드 화면
		while (true) {
			System.out.println("1.학생 관리 2.교수 관리 3.로그아웃 ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				SchoolMain.student.StudentBoard();
				break;
			case "2":
				SchoolMain.professor.ProfessorBoard();
				break;
			case "3":
				return;
			}
		}
	}
}
