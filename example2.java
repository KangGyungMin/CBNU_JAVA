
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);

//		System.out.println("500��¥�� "+ (money/500) +"��" );
//		System.out.println("100��¥��"+ (money%500)/100+"��");
//		System.out.println("50��¥��"+ ((money%500)%100)/50+"��");
//		System.out.println("10��¥��"+ (((money%500)%100)%50)/10+"��");
		
		for(int i=0; i<coinUnit.length; i++)
		{
			System.out.println(coinUnit[i]+"��¥�� + "+ money/coinUnit[i] +"��");
			money = money%coinUnit[i];
			
		}
		
		

	}

}
