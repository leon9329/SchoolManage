import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {

	List<BoardDTO> boardList = new ArrayList<BoardDTO>();// �Խ���
	Scanner sc = new Scanner(System.in);

	BoardDAO() {
		boardList.add(new BoardDTO("�ڹٹ�", "�ȳ��ϼ���", "a"));
		boardList.add(new BoardDTO("�������", "�ݰ�����ݰ�����ݰ�����ݰ�����ݰ�����ݰ�����ݰ�����ݰ�����ݰ�����ݰ�����", "a"));
		boardList.add(new BoardDTO("������", "����������������������������������������" + "����������������", "a"));
	}

	void ShowWriteList(int num) {//num�� ��ü�� �ε���.
		
		ShowList();
		
		while (true) {
			
			System.out.println("(1)�� �ۼ� (2)�� �б� (3)�� ���� (4)�ڷ�");
			System.out.print("->");
			String s = sc.nextLine();
			switch(s) {
			case "1":
				Write(num);
				break;
			case "2":
				Read();
				break;
			case "3":
				//�� ���� �޼ҵ�
				break;
			case "4":
				return ;
				default :
					System.out.println("1~4 ����");
			}
		}
	}
	
	void ShowList() {
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println((i + 1) + ". ���� : " + boardList.get(i).getTitle() + "	(�ۼ��� : "
					+ boardList.get(i).getID() + ")");
			System.out.println("--------------------------");
		}
	}
	
	void Write(int num) {
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.println("���� : ");
		String write = sc.nextLine();
		boardList.add(new BoardDTO(title,write,(SchoolMain.student.stuList.get(num).getID())));
	}
	
	void Read() {
		System.out.print("�� ��ȣ -> ");
		String ss = sc.nextLine();
		int s = Integer.parseInt(ss);
		System.out.println("--------------------------------------");
		System.out.println("���� : " + boardList.get(s-1).getTitle() + "	(�ۼ��� : "
				+ boardList.get(s-1).getID() + ")");
		System.out.println("���� : " + boardList.get(s-1).getWrite());
		System.out.println("--------------------------------------");
		
	}
	
}
