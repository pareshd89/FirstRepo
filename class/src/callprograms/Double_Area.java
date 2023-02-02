package callprograms;

public class Double_Area 

{
  double area(double x,double y)
  {
	  return(x*y);
	  
  }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Double_Area obj=new Double_Area();
 		double z= obj.area(63.5, 63.9);
 		System.out.println("The Area is:"+z);
	}

}
