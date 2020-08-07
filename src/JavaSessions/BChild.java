package JavaSessions;

public class BChild extends AParent {
	public BChild() {
		System.out.println("child class contructor");
	}

	
	
	public BChild(int i) {
		super(i);
		
	}
	public BChild(int i,int j) {
		super(i,j);
		
	}

	public static void main(String[] args) {
		BChild obj = new BChild(); 
		BChild obj1 = new BChild(28);
		BChild obj2 = new BChild(32,54);
			
		}
	}


