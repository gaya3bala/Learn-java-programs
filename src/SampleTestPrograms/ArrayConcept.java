package SampleTestPrograms;

public class ArrayConcept {

	public static void main(String[] args) {
	//int	
		int i[]= new int[4];
		
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=50;
		
		System.out.println(i[3]);
		
		for(int j=0;j<i.length;j++)//to print all the values
			System.out.println(i[j]);
		
		//char
		
		char a[]=new char[4];
		a[0]='d';
		a[1]='+';
		a[2]='w';
		
		
		//double
		
		double d[]=new double[3];
		d[0]=12.22;
		d[1]=32.32;
		d[2]=54.54;
		
		//string
		
		String s[]=new String[3];
		
		s[0]="maya";
		s[1]="create";
		s[2]="jd";
		
		
		System.out.println(s.length);
		
		System.out.println(s[2]);
		
		//object array
		
		Object ob[]=new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 'M';
		ob[3] = "1/1/1980";
		ob[4] = 12.33;
		ob[5] = "London";
		
		System.out.println(ob.length);
		
		for(int b=0;b<ob.length;b++) // to print all the columns
			System.out.println(ob[b]);
		
				
				
				
		
		
		

	}

}
