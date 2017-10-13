
public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a = 2 ; a<9; a+=3)
			{
				for(int b=1; b<=3; b++)
				{
			
					System.out.print(a +" * " + b + " = " + a * b + "       "  );
					System.out.print((a+1) +" * " + b + " = " + (a+1) * b + "       "  );
					if(a+2 == 10)
					{
						System.out.println();
						continue;
					}
					System.out.println((a+2) +" * " + b + " = " + (a+2) * b + "       "  );
				}
				System.out.println();
				
			}

	}

}
