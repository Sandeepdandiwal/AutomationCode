package learning_Java_15_June;

public class Topic3_MainMethod {

	//Execution Engine of java class
	//Interview questions 1 - If I swap position of public and static in main method, will main method execute?
	//Answer is YES, 
	// can we change the position of void -- NO
	//main should be main its case sensitive-- program will not execute with for ex. Main and throw you an error
	//Why is main method Static and Public: 
	//Public - you define main method globally
	//Static - to bind up with other classes, because static is the property of the class that connects the other 
	// classes together
	
	//public is access specifier
	//Static is class's property
	//Void is return type of a method 
	//There will be two mains in one class
	//String[] args -- array bounds checked through String array in JVM,so this is the syntax on main method
	//String... args it will also work, it will run your program and gives the output
	//args can be replaced with other name like romeo
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
