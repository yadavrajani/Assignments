
public class ReverseStrWioutBF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="JavaClass";
       
       char chars []= str.toCharArray(); // string to char array conversion 
       for(int i=chars.length-1;i>=0;i--)
       {
    	   System.out.print(chars[i]);
       }
	}

}
