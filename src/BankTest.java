import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class BankTest {

	public static void main(String[] args){
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		accounts.add(new BankAccount(new GregorianCalendar(2012, Calendar.FEBRUARY, 12).getTime(),10_000));
		accounts.add(new BankAccount(new GregorianCalendar(2015, Calendar.JANUARY, 2).getTime(),5_000));
		accounts.add(new BankAccount(new GregorianCalendar(2000, Calendar.DECEMBER, 25).getTime(),15_000));
		
		for(Object account : accounts){
			System.out.println("Bank Account Balance: " + ((BankAccount)account).getBalance());
		}
		
		Bank bank = new Bank();
		bank.updateBalances(accounts);
		System.out.println();
		
		for(Object account : accounts){
			System.out.println("Bank Account Balance: " + ((BankAccount)account).getBalance());
		}
	}
	
}
