package callprograms;

public class cube_calc 

{ float no;
  float no1;
  float no3;
  
  void cube(float no,float no1,float no3)
  {
  this.no=no;
  this.no1=no1;
  this.no3=no3;
  float z=(no*no1*no3);
  System.out.println(z);
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube_calc obj=new cube_calc();
		obj.cube(9f, 9f, 9f);
		
	}

}
