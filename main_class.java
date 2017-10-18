
public class main_class {
	public static void main(String[] args)
	{
		Vahicle v1;
		Car c= new Car();
		v1=c;
		try
		{
			if(v1 instanceof Land)
			{
				System.out.println(v1.speed());
				System.out.println(v1.isRunning());
				System.out.println("Land");
			}
			else if(v1 instanceof Water)
			{
				System.out.println(v1.speed());
				System.out.println(v1.isRunning());
				System.out.println("Water");
			}
			else if(v1 instanceof Air)
			{
				System.out.println(v1.speed());
				System.out.println(v1.isRunning());
				System.out.println("Air");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
