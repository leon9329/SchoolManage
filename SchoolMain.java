import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolMain main = new SchoolMain();
		StudentDAO student = new StudentDAO();
		ProfessorDAO professor = new ProfessorDAO();
		
		
		while (true) {
			System.out.println("1.학생 관리 2.교수 관리 3.종료 ");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				student.StudentBoard();
				break;
			case "2":
				professor.ProfessorBoard();
				break;
			case "3":
				System.out.println("종료 되었습니다.");
				return;
			}
		}

	}

	

	

}
