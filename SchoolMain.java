import java.util.Scanner;

public class SchoolMain {

	StudentDAO student = new StudentDAO();
	ProfessorDAO professor = new ProfessorDAO();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();
		
		while(true) {	//처음 메인화면
			System.out.println("1.관리자모드 2.학생모드 3.교수모드 4.종료");
			String a = sc.nextLine();
			
			switch(a) {
			case "1":
				main.ManagerView();
				break;
			case "2":
				break;
			case "3":
				break;
			default:
				System.out.println("종료 되었습니다.");
				return ;	
			}
		}
	}
	
	void ManagerView() {	//관리자모드 화면
		while (true) {
			System.out.println("1.학생 관리 2.교수 관리 3.로그아웃 ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				student.StudentBoard();
				break;
			case "2":
				professor.ProfessorBoard();
				break;
			case "3":
				return;
			}
		}
	}
	
	void StudentView() {
		while(true) {
			System.out.println("1.정보 수정 2.수강 신청 3.게시판 4.로그아웃");
			String s = sc.nextLine();
			switch(s) {
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			default:
				return;
			
			
			}
		}
		
	}
	
	void ProfessorView() {
		
	}
	
	

	
	

	

}
