import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jumsu = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 숫자를 입력하세요: ");
		// Enter를 누를 때까지의 내용을 정수로 변환해서 n에 대입
		jumsu = scanner.nextInt();
		System.out.println("점수:" + jumsu);
		scanner.close();

		char grade;
		
		switch(jumsu / 10) {
		case 10:
			grade = 'A';
			System.out.println("입력된 점수" + jumsu + "점은 "+grade+ "학점 입니다. 축하합니다!!!");
			break;
		case 9:
			grade = 'B';
			System.out.println("입력된 점수" + jumsu + "점은 "+grade+ "학점 입니다. ");
			break;
		case 8:
		case 7:
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("다음에 잘보죠 뭐..ㅠㅠ");
			break;
			
		default:
			System.out.println("잘못 입력셨습니다");
				
		}
	}

}
