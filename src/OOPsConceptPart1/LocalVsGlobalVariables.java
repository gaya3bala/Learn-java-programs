package OOPsConceptPart1;

public class LocalVsGlobalVariables {

	//global va
			String name ="tiger";
		    int age = 25;
   //LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
   
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		int a = obj.addition();
		System.out.println(a);
		
	
	}	
	public int addition() {
		int i=10;
		int j=20;
		System.out.println(obj.name);
		int k=i+j;
		return k;
		
		
	
		
		

	}

}
