package JavaSessions;

public class DivisionMultiply {

	//with no return value
	public void division(int i,int j){
	System.out.println("the values are "+i +" "+j);
	int a = i/j;
	System.out.println(a);
	//return a;
	}
	
	public void multiply(int m,int n){
		System.out.println("the values are "+m +" "+n);
		int a = m*n;
		System.out.println(a);
		//return a;
		}
	//with return value
	public static int division1(int a, int b) {
		System.out.println("the values are "+a +" "+b);
		int c = a/b;
		return c;
		}
		
		public static int multiply(int m,int n, int o) {
			System.out.println("the values are "+m +" "+n+" "+o);
			int a = m*n*o;
			return a;
			}
	
	public static void main(String[] args) {
		DivisionMultiply obj = new DivisionMultiply();
		
		//calling methods with no return value
		obj.division(60,6);
		obj.multiply(24, 6);
		
		//calling methods with return value
		
		int l= obj.division1(55,11);
	    System.out.println(l);
	    int d = obj.multiply(23,1,11);
	    System.out.println(d);
	
	}

}
