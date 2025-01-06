package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		for (int i = 2; i <= num; i++) 
		{
			if (num%i==0)
			{
				System.out.println("Number is not prime :"+num);
				break;
			}
			else
			{
				System.out.println("Number is prime :"+num);
				break;
			}
				
			
		}
	}

}
