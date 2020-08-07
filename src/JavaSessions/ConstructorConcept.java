package JavaSessions;



public class ConstructorConcept {
	
	
    public ConstructorConcept() {
		System.out.println("default contructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("one param");
		System.out.println("the value of i " +i);
	}
	
	public ConstructorConcept(int i,int j) {
		System.out.println("two param");
		System.out.println("the values are " +i+" " +j);
	}


	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(20);
		ConstructorConcept obj2 = new ConstructorConcept(21,232);
		
		
	}

}
