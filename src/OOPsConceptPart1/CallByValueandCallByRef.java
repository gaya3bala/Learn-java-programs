package OOPsConceptPart1;

public class CallByValueandCallByRef {

	public static void main(String[] args) {
	CallByValueandCallByRef obj =new CallByValueandCallByRef();
	int i =10;
	int j =20;
	obj.addition(i,j);
	//System.out.println(z);

	}
	public int addition(int x,int y) {
		
		 int z=x+y;
		 return z;
	}
}
