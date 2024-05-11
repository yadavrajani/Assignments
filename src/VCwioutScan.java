
public class VCwioutScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sensitivity";
		int vowel=0;
		int consonants=0;
		str=str.toUpperCase();
		
		for(int i=0;i<=str.length();i++)
			{
			char ch=str.charAt(i);
			if (ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
				
				vowel++;
			else
				consonants++;
			
			System.out.println("No of vowels:"+vowel);
			System.out.println("No of consonants:"+consonants);
		}

	}

}
