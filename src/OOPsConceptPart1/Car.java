package OOPsConceptPart1;

public class Car {
	
	//class vars(global var)
	int mod;
	int wheel;

public static void main(String[] args) {
	//create objject with new keyword
	
		Car a =new Car();
		Car b =new Car();
		Car c =new Car();
		
		a.mod =2012;
		a.wheel=4;
		
		b.mod =2016;
		b.wheel=4;
		
		c.mod =2018;
		c.wheel=4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
	}

}
