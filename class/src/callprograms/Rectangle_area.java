// With passing Parameter with no Return


package callprograms;

public class Rectangle_area {
 int len;
 int bre;
 void Rect(int len,int bre)
 {
	 this.len=len;
	 this.bre=bre;
	 int z= len*bre;
	 System.out.println(z);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle_area obj=new Rectangle_area();
		obj.Rect(6, 5);
		
	}

}
