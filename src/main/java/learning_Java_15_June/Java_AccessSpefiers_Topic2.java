package learning_Java_15_June;

public class Java_AccessSpefiers_Topic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Access within pack within class only
	private static void secret()
	{
		System.out.print("This is private method");
	}
    
	// Access could be with packages and other packages, there are some conditions
	protected static void careful()
	{
		System.out.print("This is protected method");
	}
	// Access could be with packages and other packages, there are some conditions
	 static void casual()
	{
		 System.out.print("This is default method");
	}
}
