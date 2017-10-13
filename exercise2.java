
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int a = 1;
		int count = 0;
		while(sum < 100)
		{
			if(a % 2 == 0) {
				a = -a;
				sum = sum + a;
				a = -a;
			}else
				sum = sum + a;
			a++;
			count ++;
		}
		
		System.out.println("100이 넘는 횟수는 " + count + " 번째 입니다.");

	}

}
