package basicsOfJava_21_June;
//Control statements
//1. Selection/conditional statements
    //if,if else,if else if, nested if, switch
//2. Iteration and looping statements
   //for, while, do while
//3. Jump statements 
    //Break, continue, return

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selection/conditional statements
		//they control the flow of program execution on the basis of the outcome of an expression(condition)
		//condition could be true or false
		
		if(1>2)
		{
			System.out.print("condition of first if");
		} else if(true == false)
		{
			System.out.print("condition of first if else if");
		}
		else if (false == true)
		{
			System.out.print("condition of 2nd if else if");
		}
		else 
		{System.out.print("Final else part");}
	}

}
