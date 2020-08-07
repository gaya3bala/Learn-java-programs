package OOPsConceptPart2;

public class BMW extends Car {

	//when method is present in parent class as well in child class wtih same args
	
	public void start() {//overridden method
		System.out.println("BMW--start");
	}
	
	public void theftsafety() {
		System.out.println("BMW---theftsafety");
	}
}
