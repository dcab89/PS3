package Main;

	
	

	
	public class InsufficientFundsException extends Account
	{
	   private double initBalancE;
	   
	   public InsufficientFundsException(double initBalancE)
	   {
	      this.initBalancE = initBalancE;
	   } 
	   public double getBalancE()
	   {
	      return initBalancE;
	   }
	}

