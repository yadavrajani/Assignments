import java.util.Scanner;
public class VowelsConsonants 

{
	 
	void count (String str) 
	{
		int vowels=0,consonants=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i); // to separate character
			if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ) 
			vowels++;
			
			else
				consonants++;
			}
		System.out.println("no of vowels:"+vowels);
		System.out.println("no of consonants:"+consonants);
	}
	

	public static void main(String[] args) {
		
		VowelsConsonants obj= new VowelsConsonants();
		Scanner scan= new Scanner(System.in);
		System.out.println("Input string");
		String str= scan.next();
		obj.count(str);  //taking input
	}
}
