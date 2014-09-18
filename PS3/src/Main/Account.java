package Main;


import java.util.Date;

public class Account {
	private int ID;
	private double BalancE;
	private double AnnualinterestratE;
	Date DatecreateD;
	int speciID;
	double initBalancE;
	double speciAnnualinterestratE;
	double MonthlyinterestratE;
	double WithdraW;
	double DeposiT;
	
public Account(){
	ID = 0;
	BalancE = 0.0;
	AnnualinterestratE = 0.0;
	DatecreateD = new Date();
}

Account(int speciID, double initBalancE){
	ID = speciID;
	BalancE = initBalancE;
}



public int getID(){
	return ID;
}
    public void setID(){
	ID = speciID;
}
    
    
public double getBalanCE(){
	return BalancE;
}
    public void setBalancE(){
	BalancE = initBalancE;
}
    
    
public double getAnnualinterestratE(){
	return AnnualinterestratE;
}
    public void setAnnualinterestratE(){
	AnnualinterestratE = speciAnnualinterestratE;
}

    
public Date getDatecreateD(){
	return DatecreateD;
}

public double getMonthlyinterestratE(){
	MonthlyinterestratE = AnnualinterestratE / 12;
	return AnnualinterestratE/12;
}

public double WithdraW( double initBalanacE)
	   throws InsufficientFundsException{
		if (BalancE <= initBalancE){
		throw new InsufficientfundsexceptioN (initBalancE - BalancE);
		}
		else{
		BalancE -= initBalancE;
		
	return (BalancE -= WithdraW);
		}
}
	   

public double DeposiT(){
	return BalancE += DeposiT;
}





}
