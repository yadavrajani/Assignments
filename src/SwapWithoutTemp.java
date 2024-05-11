
public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a= 10;
       int b= 20;
       System .out.println("before values");
       System .out.println("value:" + a);
       System .out.println("value:"  + b);
       
       a = a^b;
       b =a^b;
       a =b^a;
       System .out.println("after values");
       System .out.println("value:" + a);
       System .out.println("value:"  + b);

	}

}
