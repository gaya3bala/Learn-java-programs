package OOPsConceptPart2;

public class Testcar {

	public static void main(String[] args) {
		
		//static polymorphism
		BMW b1 = new BMW();
		b1.start();
		b1.restart();
		b1.theftsafety();
		System.out.println("****");
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.engine();
		System.out.println("****");
		
		Car c2 = new BMW();//dynamic polymorohism
		c2.start();
		c2.stop();
		c2.restart();
		
		System.out.println("******");
		vehicle v = new vehicle();
		v.engine();
		v.start();
		System.out.println("******");
	   vehicle v1 = new Car();
	   v1.start();
	  // v1.restart();
	   v1.engine();
		
		

	}

}
