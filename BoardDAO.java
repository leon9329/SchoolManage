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
		while (true) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println((i + 1) + ". ���� : " + boardList.get(i).getTitle() + "	(�ۼ��� : "
						+ boardList.get(i).getID() + ")");
				System.out.println("--------------------------");
			}
			System.out.println("1.�� �ۼ� 2.�� �б� 3.�� ���� 4.�ڷ�");
			System.out.println("->(�����Է�)");
			String s = sc.nextLine();
			switch(s) {
			case "1":
				write(num);
				break;
			case "2":
				//�� �б� �޼ҵ�
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
	
	void write(int num) {
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.println("���� : ");
		String write = sc.nextLine();
		boardList.add(new BoardDTO(title,write,(SchoolMain.student.stuList.get(num).getID())));
	}
	
}
