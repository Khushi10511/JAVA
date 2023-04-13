class SavingsAccount
{
    private static double AnnualInterestRate;
    private double SavingsBalance;
    private int AccountNumber;
    public SavingsAccount(int AccNo,double SavBal)
    {
        AccountNumber = AccNo;
        SavingsBalance = SavBal;
    }
    public void CalculateMonthlyInterest()
    {
        double MonthlyInterest = (SavingsBalance*AnnualInterestRate)/12;
        SavingsBalance += MonthlyInterest;
    }
    public static void ModifyInterestRate(double NewRate)
    {
        AnnualInterestRate = NewRate;
    }
    public void ShowBalance()
    {
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Savings Balance: " +SavingsBalance);
    }
}
public class TestSavingsAccount
{
    public static void main (String[] args)
    {
        SavingsAccount.ModifyInterestRate(0.04);
        SavingsAccount saver1 = new SavingsAccount(1, 1000.0);
        saver1.CalculateMonthlyInterest();
        System.out.println("Saver 1 - After 1 month:");
        saver1.ShowBalance();

        SavingsAccount.ModifyInterestRate(0.05); 
        SavingsAccount saver2 = new SavingsAccount(2, 2000.0);
        saver2.CalculateMonthlyInterest();
        System.out.println("Saver 2 - After 1 month:");
        saver2.ShowBalance();
    } 
}


