package OOPsConceptPart1;

public class StaticandNonstaticConcept {
	//globa; var
	
	static String name = "Tom";
	int age = 45;
	

	public static void main(String[] args) {
	//calling non static method
		StaticandNonstaticConcept obj = new StaticandNonstaticConcept();
		obj.sum();
		System.out.println(obj.age)	;
		
    // calling static method
	// direct calling
		sendmail();
	//using class name
		StaticandNonstaticConcept.sendmail();
	// calling static var	
		System.out.println(name);
		

	}
	
	public void sum() {
		System.out.println("sum method:");
		
	}
	
	public static void sendmail() {
		System.out.println("send mail method");
	}

}
