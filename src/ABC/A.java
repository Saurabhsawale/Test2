package ABC;

public class A 
{

	public static void main(String[] args) 
	{
		int a=1234;
		int Rev=0;
		
		for(int i=a; i>0;  i=i/10)
		{
			int Rem = i % 10;
			 Rev = (Rev*10) + Rem;
		
		}
		System.out.println(Rev);
		
		
		
		
		
	}
}
