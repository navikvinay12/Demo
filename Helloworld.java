public class Helloworld 
{
	public static void main(String[] args) 
	{
		while(true)
		{
		System.out.println("Welcome to Helloworld Program");
		try 
		{
			Thread.sleep((60000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
