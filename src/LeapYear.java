import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Ener a year");
        int year=scan.nextInt();
    
    
    if(year%4==0 && (year%100!=0 )|| (year%400==0)) 
    	System.out.println("Is a leap year");
    	
    	else
    		System.out.println("Is not a leap year");
    
	}

}
