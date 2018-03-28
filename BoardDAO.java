import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {

	List<BoardDTO> boardList = new ArrayList<BoardDTO>();// 게시판
	Scanner sc = new Scanner(System.in);

	BoardDAO() {
		boardList.add(new BoardDTO("자바바", "안녕하세요", "a"));
		boardList.add(new BoardDTO("재미지당", "반가워요반가워요반가워요반가워요반가워요반가워요반가워요반가워요반가워요반가워요", "a"));
		boardList.add(new BoardDTO("힘내라", "고마워고마워고마워고마워고마워고마워고마워고마워고마워고마워" + "고마워고마워고마워고마워", "a"));
	}

	void ShowWriteList() {
		while (true) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println((i + 1) + ". 제목 : " + boardList.get(i).getTitle() + "	(작성자 : "
						+ boardList.get(i).getID() + ")");
				System.out.println("--------------------------");
			}
			System.out.println("1.글 작성 2.글 읽기 3.글 수정 4.뒤로");
			System.out.println("->(숫자입력)");
			String s = sc.nextLine();
			switch(s) {
			case "1":
				//글작성 메소드
				break;
			case "2":
				//글 읽기 메소드
				break;
			case "3":
				//글 수정 메소드
				break;
			case "4":
				return ;
				default :
					System.out.println("1~4 선택");
			}
		}
	}
}
