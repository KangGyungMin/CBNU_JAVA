
public class ElseifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jumsu = 200-120;  //자신의 점수
		if(jumsu >= 90 && jumsu <= 100) {
			System.out.println("당신은 학점은 A입니다.");
		}
		else if(jumsu >= 80 && jumsu < 90) {
			System.out.println("당신은 학점은 B입니다.");
		}
		else if(jumsu >= 70 && jumsu < 80) {
			System.out.println("당신은 학점은 C입니다.");
		}else {
			System.out.println("힘내세요.");
		}

	}

}
