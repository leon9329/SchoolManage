import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Student DAO
public class StudentDAO{
	ArrayList<StudentDTO> stuList = new ArrayList<StudentDTO>();
	Set<String> stuID = new HashSet<>();
	
	
	StudentDAO(){//디폴트 학생 + id 디폴트 비번 = 1111
		stuList.add(new StudentDTO("a","1","홍길동","남","20","수학"));
		stuID.add("a");
		stuList.add(new StudentDTO("b","2","정우성","남","26","물리"));
		stuID.add("b");
		stuList.add(new StudentDTO("c","3","김현아","여","25","과학"));
		stuID.add("c");
		stuList.add(new StudentDTO("d","4","김지원","여","24","영어"));
		stuID.add("d");
		stuList.add(new StudentDTO("e","5","황우석","여","23","국어"));
		stuID.add("e");		
	}
	
	Scanner sc = new Scanner(System.in);
	
	void StudentBoard() {// 관리자가 학생 관리

		while (true) {
			System.out.println("1.학생 추가 2.학생 리스트 3.학생 삭제 4.학생 정보 수정 5.뒤로");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				AddStudent();
				break;
			case "2":
				System.out.println("학번	이름	성별	나이	좋아하는과목");
				System.out.println("------------------------------------------");
				for (int i = 0; i < stuList.size(); i++) 
					showStudent(stuList.get(i));
				System.out.println("------------------------------------------");
				System.out.println();
				break;
			case "3":
				if (deleteStudent())
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
				break;
			case "4":
				CheckStudent();
				break;
			case "5":
				return;
			}
		}

	}
	
	boolean CheckID(String id) {	//로그인시 id확인
		Iterator<String> iterator = stuID.iterator();
		while(iterator.hasNext()) {
			if(id.equals(iterator.next())) {
				return true;
			}else
				return false;
		}
		return false;		
	}
	

	
	/*	void SelfUpdateStudent(StudentDTO student) {	//학생 스스로 정보수정
	System.out.println("무엇을 수정하시겠습니까?");
	System.out.println("1.학번 2.이름 3.성별 4.나이 5.좋아하는 과목");
	String n = sc.nextLine();
	switch (n) {
	case "1":
		student.setClassOf(sc.nextLine());
		break;
	case "2":
		student.setName(sc.nextLine());
		break;
	case "3":
		student.setAge(sc.nextLine());
		break;
	case "4":
		student.setPrivateCourse(sc.nextLine());
		break;
	default:	
		System.out.println("1~5번중 선택하세요.");
		break;
	}
	
}*/
	

	void AddStudent() { // 학생 추가 메소드
		
		System.out.print("학번 : ");
		String classOf = sc.nextLine();

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("성별 : ");
		String sex = sc.nextLine();

		System.out.print("나이 : ");
		String age = sc.nextLine();

		System.out.print("좋아하는 과목 : ");
		String privateSubject = sc.nextLine();

		stuList.add(new StudentDTO(classOf, name, sex, age, privateSubject));
	}

	

	boolean deleteStudent() { // 학생 삭제 메소드
		System.out.println("삭제할 학생 학번 : ");
		String classOf = sc.nextLine();
		System.out.println("삭제할 학생 이름 : ");
		String name = sc.nextLine();

		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getClassOf().equals(classOf) && stuList.get(i).getName().equals(name)) {
				stuList.remove(i);
				return true;

			}

		}
		return false;
	}

	void CheckStudent() { // 수정 학생 학번, 이름 확인

		System.out.println("수정할 학생의 학번 : ");
		String classOf = sc.nextLine();
		System.out.println("수정할 학생 이름 : ");
		String name = sc.nextLine();

		for (int i = 0; i < stuList.size(); i++) {
			StudentDTO student = stuList.get(i);
			if (student.getClassOf().equals(classOf) && student.getName().equals(name)) {
				UpdateStudent(student);
				return;
			}
		}
		System.out.println("학번 또는 이름이 잘못됬습니다.");
	}

	
	void UpdateStudent(StudentDTO student) {	//학생 수정
		System.out.println("무엇을 수정하시겠습니까?");
		System.out.println("1.학번 2.이름 3.성별 4.나이 5.좋아하는 과목");
		String s = sc.nextLine();
		switch (s) {
		case "1":
			System.out.println("새로운 학번: ");
			student.setClassOf(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		case "2":
			System.out.println("새로운 이름: ");
			student.setName(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		case "3":
			if (student.getSex().equals("남"))
				student.setSex("여");
			else
				student.setSex("남");
			System.out.println("수정 완료.");
			break;
		case "4":

			System.out.println("새로운 나이: ");
			student.setAge(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		case "5":
			System.out.println("가장 좋아하는 과목 : ");
			student.setPrivateCourse(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		default:
			System.out.println("1~5번중 선택하세요.");

		}

	}
	

	
	void showStudent(StudentDTO student) {
		System.out.println(student.getClassOf() + "	" + student.getName() + "	" 
				+ student.getSex() + "	" + student.getAge() + "	"  + student.getPrivateCouse());
	}
}