package cases;

public class Singleton_Class {
	
	private static  Singleton_Class singleton_Class_Instance = null;
	public String str ;
	
	private Singleton_Class()
	{
		str = "Single ton class demo";
	}
	
	public static  Singleton_Class getInstance_SingletonClass()
	{
		
		
		if(singleton_Class_Instance == null )
		{
			singleton_Class_Instance = new Singleton_Class();
		}
		return singleton_Class_Instance;
		
	}
	
	
	public  static  Singleton_Class  demo_Ex()
	{
		if(singleton_Class_Instance == null )
		{
			singleton_Class_Instance = new Singleton_Class();
		}
		
		return singleton_Class_Instance;
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		Singleton_Class x = Singleton_Class.getInstance_SingletonClass();
		Singleton_Class y = Singleton_Class.getInstance_SingletonClass();
		Singleton_Class z = Singleton_Class.getInstance_SingletonClass();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		Singleton_Class sc = new Singleton_Class();
		sc.demo_Ex();
		
		
		
		
	}
	
	
	

}
