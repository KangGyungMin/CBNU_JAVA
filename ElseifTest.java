
public class ElseifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jumsu = 200-120;  //�ڽ��� ����
		if(jumsu >= 90 && jumsu <= 100) {
			System.out.println("����� ������ A�Դϴ�.");
		}
		else if(jumsu >= 80 && jumsu < 90) {
			System.out.println("����� ������ B�Դϴ�.");
		}
		else if(jumsu >= 70 && jumsu < 80) {
			System.out.println("����� ������ C�Դϴ�.");
		}else {
			System.out.println("��������.");
		}

	}

}
