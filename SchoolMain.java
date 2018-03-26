import java.util.Scanner;

public class SchoolMain {
	static final String HOST_ID = "test";	//관리자 id and password
	static final String HOST_PASSWROD = "123";
	
	StudentDAO student = new StudentDAO();
	ProfessorDAO professor = new ProfessorDAO();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();
		String id, password;
		
		while(true) {	//처음 메인화면
			System.out.println("1.관리자모드 2.학생모드 3.교수모드 4.종료");
			String a = sc.nextLine();
			
			switch(a) {
			case "1":
				System.out.println("관리자 아이디 : ");
				id = sc.nextLine();
				System.out.println("관리자 비번 : ");
				password = sc.nextLine();
				if(id.equals(HOST_ID) && password.equals(HOST_PASSWROD))
					main.ManagerView();
				else 
					System.out.println("id or password Error!");
				break;
			case "2":
				System.out.println("아이디 : ");
				id = sc.nextLine();
				System.out.println("비번 : ");
				password = sc.nextLine();
				if(main.student.CheckID(id,password)) {
					main.student.StudentView();
				}
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
	
	

	
	

	
	

	

}
