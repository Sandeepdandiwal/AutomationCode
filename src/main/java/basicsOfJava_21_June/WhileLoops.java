package basicsOfJava_21_June;

public class WhileLoops {
//Step 1 intialize value
//Step 2 Condition
//Step 3 Increment/decrement // 27 date operators
// IF need arise, control logic by jump statements
	public static void main(String[] args) {
		// When we do not know end outcome
		int j = 0;
		int k =0;
		int i= 5;
		while(i<=50)
		{
		System.out.println (i);
		k=i+j;
		j=i;
		i=i+5;
		}
		
		System.out.println (k);
	}

}
