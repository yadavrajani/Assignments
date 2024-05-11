
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    int x=0; int y=1;int count=10;
    System.out.println("febonacci series of"+count+"numbers");
    
    	for(int i=0;i<=count;i++){
    		int sum=x+y;
    		x=y;
    		y=sum;
    		
    		System.out.println(x);
    	}
	}

}
