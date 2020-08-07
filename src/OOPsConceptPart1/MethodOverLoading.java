package OOPsConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj= new MethodOverLoading();
		
		//callinf methods
		obj.sum();
		obj.sum(10);
		obj.sum(11,12);

	}
   public void sum() {
	   System.out.println("sum method-zero para");
	   
   }
   public void sum(int i) {
	   System.out.println("sum method-1 para");
	   System.out.println(i);
   }
   public void  sum(int i,int j) {
	   System.out.println("sum method-2 para");
	   System.out.println(i+j);
   }
}
