import java.sql.Date;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountClass account = new AccountClass(1122, 20000.0);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterestRate());
        System.out.println("Date Created: " + account.getDataCreatead());
		}
}
	class AccountClass {
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dataCreatead;
		
		public AccountClass() {
			//dataCreatead =  new Date();
		}
		
		public AccountClass (int id, double balance) {
			this();
			this.id= id;
			this.balance = balance;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setAnnualInterestRate(double annualInterestRate)
		{
			this.annualInterestRate = annualInterestRate;
		}
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		public Date getDataCreatead() {
			return dataCreatead;
		}
		public void setDataCreatead(Date dataCreatead) {
			this.dataCreatead = dataCreatead;
		}
		public double getMonthlyInterestRate()
		{
			return (annualInterestRate/100)/12;
		}
		public void withdraw(double amount)
		{
			this.balance = balance - amount;
		}
		public void deposit(double amount)
		{
			this.balance = balance + amount;
		}
	}
///////