package SampleTestPrograms;

public class TwoDimArr {

	public static void main(String[] args) {
		
		String sd[][] = new String[3][5];
		
		System.out.println(sd.length);
		System.out.println(sd[1].length);
		
		
//first row
		
		sd[0][0] = "A";
		sd[0][1] = "B";
		sd[0][2] = "C";
		sd[0][3] = "D";
		sd[0][4] = "E";
		
	//2nd row
		
		sd[1][0] = "A1";
		sd[1][1] = "B1";
		sd[1][2] = "C1";
		sd[1][3] = "D1";
		sd[1][4] = "E1";
		
		//3rd row
		sd[2][0] = "A2";
		sd[2][1] = "B2";
		sd[2][2] = "C2";
		sd[2][3] = "D2";
		sd[2][4] = "E2";
		
		System.out.println(sd[2][1]);
		System.out.println(sd[0][0]);
		
		//to print all the values
		
		for(int row=0;row<sd.length;row++)
			//System.out.println();
		{ for(int col=0;col<sd[0].length;col++) {
			System.out.print(sd[row][col]+" ");
		}
		System.out.println();
		}
		
		
		
	}

}
