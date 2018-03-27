import java.util.ArrayList;
import java.util.Scanner;

//professor DAO
public class ProfessorDAO {
	ArrayList<ProfessorDTO> proList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	ProfessorDAO(){
		proList.add(new ProfessorDTO("����","��","50","����"));
		proList.add(new ProfessorDTO("��߻�","��","55","����"));
		proList.add(new ProfessorDTO("������","��","53","����"));
		proList.add(new ProfessorDTO("�����","��","51","ü��"));
		proList.add(new ProfessorDTO("������","��","52","��ǻ��"));
		}

	void AddProfessor() { // ���� �߰� �޼ҵ�

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("���� : ");
		String sex = sc.nextLine();

		System.out.print("���� : ");
		String age = sc.nextLine();

		System.out.print("���� ���� : ");
		String subject = sc.nextLine();

		proList.add(new ProfessorDTO(name,sex,age,subject));
	}


	boolean deleteProfessor() { // ���� ���� �޼ҵ�

		System.out.println("������ ���� �̸� : ");
		String name = sc.nextLine();

		System.out.println("������ ������ ������ : ");
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

	
	void CheckProfessor() { // ���� ����
		System.out.println("������ ���� �̸�");
		String name = sc.nextLine();
		System.out.println("������ ������ ������");
		String suject = sc.nextLine();
		
		for(int i = 0; i < proList.size(); i++) {
			ProfessorDTO professor = proList.get(i);
			if(professor.getName().equals(name) 
					&& professor.getSubject().equals(suject)) {
				UpdateProfessor(professor);
				return;
			}
		}
		System.out.println("���� �̸� �Ǵ� ������ �߸��Ǿ����ϴ�.");
		

	}
	
	void UpdateProfessor(ProfessorDTO professor) {
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		System.out.println("1.�̸� 2.���� 3.���� 4.��������");
		String s = sc.nextLine();
		
		switch (s) {
		case "1":
			System.out.println("���ο� �̸�: ");
			professor.setName(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		case "2":
			if (professor.getSex().equals("��"))
				professor.setSex("��");
			else
				professor.setSex("��");
			System.out.println("���� �Ϸ�.");
			break;
		case "3":
			System.out.println("������ ����: ");
			professor.setAge(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		case "4":

			System.out.println("���ο� ����: ");
			professor.setSubject(sc.nextLine());
			System.out.println("���� �Ϸ�.");
			break;
		default:
			System.out.println("1~4���� �����ϼ���.");

		}
	}
	
	public void ShowProfessors(ProfessorDTO professor) { // ���� ���� ���
		System.out.println(professor.getName()+ "	" + professor.getAge() + "	" 
				+ professor.getSex() + "	" + professor.getSubject());
	}

	

}
