import java.util.Scanner;

public class SchoolMain {
	static final String HOST_ID = "test";	//������ id and password
	static final String HOST_PASSWROD = "123";
	
	StudentDAO student = new StudentDAO();
	ProfessorDAO professor = new ProfessorDAO();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();
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
					main.ManagerView();
				else 
					System.out.println("id or password Error!");
				break;
			case "2":
				System.out.println("���̵� : ");
				id = sc.nextLine();
				System.out.println("��� : ");
				password = sc.nextLine();
				if(main.student.CheckID(id,password)) {
					main.student.StudentView();
				}
			case "3":
				break;
			default:
				System.out.println("���� �Ǿ����ϴ�.");
				return ;	
			}
		}
	}
	
	void ManagerView() {	//�����ڸ�� ȭ��
		while (true) {
			System.out.println("1.�л� ���� 2.���� ���� 3.�α׾ƿ� ");
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
