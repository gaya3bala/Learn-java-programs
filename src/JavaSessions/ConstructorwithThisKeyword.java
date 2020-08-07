package JavaSessions;

public class ConstructorwithThisKeyword {
	
	String name1;
	int age1;
	
	public ConstructorwithThisKeyword(String name,int age)
	
	{System.out.println("name is"+name);
	 System.out.println("age is "+age);
	 this.name1=name;
		this.age1=age;
	}
	

	public static void main(String[] args) {
		ConstructorwithThisKeyword obj = new ConstructorwithThisKeyword("Peter", 36);
		
		//System.out.println(name1);
		//System.out.println(age1);

	}

}
