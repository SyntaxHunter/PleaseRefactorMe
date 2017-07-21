import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Bank {
	final double PERC = 2.54/100;
    
	void updateBalances(ArrayList<BankAccount> accounts){
		for (BankAccount object : accounts) {
			double xtra = calculateInterest(object);
   		 	object.money = object.money + xtra;
		}
    }
   
    double calculateInterest(BankAccount account) {

    	Date dateOpened = account.date;
    	double amount = account.getBalance();
   	 	
    	// represents current time
    	Calendar a = Calendar.getInstance(Locale.US);
    	a.setTime(new Date());
    	//represents time account was created
    	Calendar b = Calendar.getInstance(Locale.US);
    	b.setTime(dateOpened);
    	
    	//difference in years
    	int diff = a.get(Calendar.YEAR) - b.get(Calendar.YEAR);
    	
    	//if month created was greater, add another year
    	//if day is greater, add another year
    	//if another year has begun, add another year to interest calculation
    	if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
           (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
        	diff++;
    	}
    	
    	account.date = a.getTime();

    	//return  2.54 * amount;
   	 	return diff * PERC * amount;
    }


}