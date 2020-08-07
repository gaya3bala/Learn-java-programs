package OOPsConceptPart1;

public class Functions {
//main method is starting point of execution
	public static void main(String[] args) {
	
		Functions obj =  new Functions();
		
		obj.test();
		
		int l = obj.pa();
		System.out.println(l);
		
		boolean j= obj.qa();
		System.out.println(j);
		
		
		int m=obj.multiply(10,23);
		System.out.println(m);
		
		
		
	}

	public void test() {
		System.out.println("test method");
		
		
	}
	
	public boolean qa() {
		int i=10;
		if (i>10)
			return true;
		else 
			return false;
		
	}
	
	public int pa() {
		int a =10;
		int b=20;
		int c =a+b;
		 return c;
		 
	}
	
	public int multiply(int x,int y) {
	    System.out.println("multiply method");
	    int d= x*y;
	    return d;
	}
}


