package Arrays;

public class Vowel_String {
	
	void VowelCount()
	{
	int count=0;
	String st="icecream";
	
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
				count++;
		}
		System.out.println("THe numbers of Vowels in the String are= "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel_String vs=new Vowel_String();
		vs.VowelCount();
	}

}
