import java.util.Scanner;

public class SchoolMain {
	static final String HOST_ID = "test";	//������ id and password
	static final String HOST_PASSWROD = "123";
	
	static StudentDAO student = new StudentDAO();
	static ProfessorDAO professor = new ProfessorDAO();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ManagerMethod manager = new ManagerMethod();

		Scanner sc = new Scanner(System.in);
		
		
		String id, password;
		
		
		while(true) {	//ó�� ����ȭ��
			System.out.println("1.�����ڸ�� 2.�л���� 3.������� 4.����");
			String a = sc.nextLine();
			
			switch(a) {
			
			case "1":
				System.out.println("������ ���̵� : ");
				id = sc.nextLine();
				System.out.println("������ ��� : ");
				password = sc.nextLine();
				if(id.equals(HOST_ID) && password.equals(HOST_PASSWROD))
					manager.ManagerView();
				else 
					System.out.println("id or password Error!");
				break;
			case "2":
				System.out.println("���̵� : ");
				id = sc.nextLine();
				System.out.println("��� : ");
				password = sc.nextLine();
				if(student.CheckID(id,password)) {
					student.StudentView();
				}
				break;
			case "3":
				System.out.println("���̵� : ");
				id = sc.nextLine();
				System.out.println("��� : ");
				password = sc.nextLine();
				if(professor.CheckID(id,password)) {
					professor.ProfessorView();
				}
				break;
			default:
				System.out.println("���� �Ǿ����ϴ�.");
				return ;	
			}
		}
	}
	

	
	

	
	

	
	

	

}
