package Arrays;
import java.util.Scanner;

public class Vowel_String2 {
	
	void Vowel_Count()
	{
	int count=0;
	String st;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string of lower Case");
	st=sc.next();
	
	
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
				count++;
		}
		System.out.println("THe numbers of Vowels in the String are= "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel_String2 vs2=new Vowel_String2();
		vs2.Vowel_Count();
	}

}
