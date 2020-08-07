package SampleTestPrograms;

public class Loopconcepts {

	public static void main(String[] args) {
		
		//print even numbers b/w 1 to 30
		//int i;
		//for(i=1;i<=30;i++)
			//	{if(i%2==0)
				//{System.out.println(i);
		/*
		int n=30;
		System.out.println("even numbers from 1 to "+n+" are: ");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
			//this will type even numbers everytime
			//	System.out.println("even numbers from 1 to "+n+" are: ");
				System.out.println(i);
			}
				
		}
*/
	   //print odd numbers b/w 1 to 40
		
		int a =40;
		int j;
		System.out.println("odd numbers b/w 1 to "+a+" are:");
		for(j=1;j<=a;j++)
		{ if(j % 2 != 0)
		{System.out.println(j);
		}
		
		}
		
		//pyramid example
		
		for(int x=10;x>=1;x--)
		for(int y=1;y<=x;y++)
			{System.out.print("*");
			
			}
		System.out.println();
	}
	
}
