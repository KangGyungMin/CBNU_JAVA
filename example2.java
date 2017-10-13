
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);

//		System.out.println("500원짜리 "+ (money/500) +"개" );
//		System.out.println("100원짜리"+ (money%500)/100+"개");
//		System.out.println("50원짜리"+ ((money%500)%100)/50+"개");
//		System.out.println("10원짜리"+ (((money%500)%100)%50)/10+"개");
		
		for(int i=0; i<coinUnit.length; i++)
		{
			System.out.println(coinUnit[i]+"원짜리 + "+ money/coinUnit[i] +"개");
			money = money%coinUnit[i];
			
		}
		
		

	}

}
