import java.util.Scanner;

public class SchoolMain {
	static final String HOST_ID = "test";	//관리자 id and password
	static final String HOST_PASSWROD = "123";
	
	static StudentDAO student = new StudentDAO();
	static ProfessorDAO professor = new ProfessorDAO();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ManagerMethod manager = new ManagerMethod();

		Scanner sc = new Scanner(System.in);
		
		
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
					manager.ManagerView();
				else 
					System.out.println("id or password Error!");
				break;
			case "2":
				System.out.println("아이디 : ");
				id = sc.nextLine();
				System.out.println("비번 : ");
				password = sc.nextLine();
				if(student.CheckID(id,password)) {
					student.StudentView();
				}
				break;
			case "3":
				System.out.println("아이디 : ");
				id = sc.nextLine();
				System.out.println("비번 : ");
				password = sc.nextLine();
				if(professor.CheckID(id,password)) {
					professor.ProfessorView();
				}
				break;
			default:
				System.out.println("종료 되었습니다.");
				return ;	
			}
		}
	}
	

	
	

	
	

	
	

	

}
