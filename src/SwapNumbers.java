
public class SwapNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int x=900;
       int y=200;
       
       System .out.println("before values");
       System .out.println("value:" + x);
       System .out.println("value:"  + y);
       
       int temp= x;
       x=y;
       y=temp;
       
       System .out.println("after values");
       System .out.println("value:" + x);
       System .out.println("value:"  + y);
	}

}