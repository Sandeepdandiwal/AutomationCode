package basicsOfJava_21_June;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year1 = 1996;
        int year2 = 2000;
        int year3 = 1984;
        // (year should be completely divided by 400) or (year should be divided by 4 and does not divide by 100)
        if(year1%400 == 0||(year1%4==0&&year1%100 !=0))
        {
        	System.out.println("year is leap year:"+year1);
        }
        
        else
        {
        	System.out.println("year is not a leap year");
        }
        if(year2%400 == 0||(year2%4==0&&year2%100 !=0))
        {
        	System.out.println("year is leap year:"+year2);
        }
        
        else
        {
        	System.out.println("year is not a leap year");
        }
        if(year3%400 == 0||(year3%4==0&&year3%100 !=0))
        {
        	System.out.println("year is leap year:"+year3);
        }
        
        else
        {
        	System.out.println("year is not a leap year");
        }
	}

}
