package Main;


public class Test extends Account{
	
    public static void main (String[] args) 
    throws InsufficientFundsException{
    Account test = new Account(1122, 20000);
    test.setAnnualinterestratE(4.5);
    test.WithdraW(2500);
    try{ test.WithdraW(2500);}
    catch (InsufficientFundsException D){
    	System.out.println(D.toString());
    }
    test.DeposiT(3000);
    System.out.println("The balance of the acount is " + test.getBalancE());
	System.out.println("The monthly interest is: \n " + test.getMonthlyinterestratE());
	System.out.println("Account created on: \n " + test.getDatecreateD());
		  }
    try{ Test.WithdraW(20001);}
    catch(InsufficientFundsException D){
    	System.out.println(D.toString());
    }
}