import java.util.ArrayList;
import java.util.Scanner;

//professor DAO
public class ProfessorDAO {
	ArrayList<ProfessorDTO> proList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	ProfessorDAO(){
		proList.add(new ProfessorDTO("남진","남","50","수학"));
		proList.add(new ProfessorDTO("장발산","남","55","과학"));
		proList.add(new ProfessorDTO("오나미","여","53","영어"));
		proList.add(new ProfessorDTO("김관진","남","51","체육"));
		proList.add(new ProfessorDTO("오수미","여","52","컴퓨터"));
		}
	
	void ProfessorBoard() {	//교수 관리


		while (true) {
			System.out.println("1.교수 추가 2.교수 리스트 3.교수 삭제 4.교수진 수정 5.뒤로");
			String n = sc.nextLine();

			switch (n) {
			case "1":
				AddProfessor();
				break;
			case "2":
				System.out.println("이름	성별	나이	전공");
				System.out.println("------------------------------");
				for (int i = 0; i < proList.size(); i++) 
					ShowProfessors(proList.get(i));
				System.out.println("------------------------------");
				System.out.println();
				break;
			case "3":
				if (deleteProfessor())
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
				break;
			case "4":
				CheckProfessor();
				break;
			case "5":
				return;
			}
		}

	}
	

	

	void AddProfessor() { // 교수 추가 메소드

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("성별 : ");
		String sex = sc.nextLine();

		System.out.print("나이 : ");
		String age = sc.nextLine();

		System.out.print("전공 과목 : ");
		String subject = sc.nextLine();

		ProfessorDTO professor = new ProfessorDTO(name,sex,age,subject);
		proList.add(professor);
	}


	boolean deleteProfessor() { // 교수 삭제 메소드

		System.out.println("삭제할 교수 이름 : ");
		String name = sc.nextLine();

		System.out.println("삭제할 교수의 교과목 : ");
		String subject = sc.nextLine();

		for (int i = 0; i < proList.size(); i++) {
			if (proList.get(i).getSubject().equals(subject)
					&& proList.get(i).getName().equals(name)) {
				proList.remove(i);
				return true;
			}

		}
		return false;
	}

	
	void CheckProfessor() { // 교수 수정
		System.out.println("수정할 교수 이름");
		String name = sc.nextLine();
		System.out.println("수정할 교수의 교과목");
		String suject = sc.nextLine();
		
		for(int i = 0; i < proList.size(); i++) {
			ProfessorDTO professor = proList.get(i);
			if(professor.getName().equals(name) 
					&& professor.getSubject().equals(suject)) {
				UpdateProfessor(professor);
				return;
			}
		}
		System.out.println("교수 이름 또는 과목이 잘못되었습니다.");
		

	}
	
	void UpdateProfessor(ProfessorDTO professor) {
		System.out.println("무엇을 수정하시겠습니까?");
		System.out.println("1.이름 2.성별 3.나이 4.전공과목");
		String s = sc.nextLine();
		
		switch (s) {
		case "1":
			System.out.println("새로운 이름: ");
			professor.setName(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		case "2":
			if (professor.getSex().equals("남"))
				professor.setSex("여");
			else
				professor.setSex("남");
			System.out.println("수정 완료.");
			break;
		case "3":
			System.out.println("수정할 나이: ");
			professor.setAge(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		case "4":

			System.out.println("새로운 전공: ");
			professor.setSubject(sc.nextLine());
			System.out.println("수정 완료.");
			break;
		default:
			System.out.println("1~4번중 선택하세요.");

		}
	}
	
	public void ShowProfessors(ProfessorDTO professor) { // 교수 정보 출력
		System.out.println(professor.getName()+ "	" + professor.getAge() + "	" 
				+ professor.getSex() + "	" + professor.getSubject());
	}

	

}
