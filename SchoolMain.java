import java.util.Scanner;

public class SchoolMain {

	StudentDAO student = new StudentDAO();
	ProfessorDAO professor = new ProfessorDAO();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();
		
		while(true) {	//ó�� ����ȭ��
			System.out.println("1.�����ڸ�� 2.�л���� 3.������� 4.����");
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
	
	void StudentView() {
		while(true) {
			System.out.println("1.���� ���� 2.���� ��û 3.�Խ��� 4.�α׾ƿ�");
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
