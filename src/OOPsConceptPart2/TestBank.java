package OOPsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		
		System.out.println(USBank.min_var);
		
		hs.carloan();
		hs.balanceinq();
		hs.credit();
		hs.eduloan();
		hs.debit();
		hs.mutualfund();
		
		//dynamic polymorphism
		//child class object can be referenced by parent interface reference var
		USBank b = new HSBCBank();
		b.balanceinq();
		b.credit();
		b.debit();
		b.transfermoney();
	
		
		
	}

}
