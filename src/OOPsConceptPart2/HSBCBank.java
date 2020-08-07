package OOPsConceptPart2;

public class HSBCBank implements USBank,BrazilBank {  //multiple inheritance
	//Is-a relatioship
	//below methods must be overridden from interface USBank
	public void credit() {
		System.out.println("nsbc--credit");
	}
	
	public void debit() {
		System.out.println("nsbc--dedit");
	}
	
	public void balanceinq() {
		System.out.println("hsbc---balinq");
	}
	
	public void transfermoney() {
		System.out.println("hsbc--transermoney");
	}
	
	//own methods of hsbc class
	public void carloan() {
		System.out.println("hsbc--carloan");
	}
	
	public void eduloan() {
		System.out.println("hsbc---eduloan");
	}
	

	//overriding from brazil bank
	
    public void mutualfund() {
    	System.out.println("hsbc---mutualfund");
    }
}
