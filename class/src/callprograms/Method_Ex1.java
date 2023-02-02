package callprograms;

public class Method_Ex1 {
	 int x= 10;
	 int y=3;
	 float z;
	 
	 void add()
	 { z=x+y;
	   display(z);
	   
	 }
     
	 void sub()
	 { z=x-y;
	 display (+z);
	 
	 }
	 
	 void multi()
	 {
		 z=x*y;
		 display (+z);
		 
	 }
     void divs()
     {
    	 z=x/y;
    	 display (+z);
    }
     void display (float ans)
     {
    	 System.out.println(ans);
    }
}

