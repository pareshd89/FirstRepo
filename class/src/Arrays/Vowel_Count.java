//VOWEL COUNT FROM A CHARACTER INPUT

package Arrays;

public class Vowel_Count {
	
	void vowel()
	{
		int count=0;
		char ch[]= {'a','e','t','i','r'};
		
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='o')
					count++;
			}
			System.out.println("The number of vowels are = "+count);
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel_Count vc=new Vowel_Count();
		vc.vowel();
	}

}
