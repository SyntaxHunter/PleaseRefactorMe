import java.util.Date;

class BankAccount {

    Date date;
    double money;

    BankAccount(Date date, double money) {
   	 this.date = date;
   	 this.money = money;
    }

    public double getBalance() {
   	 return money;
    }

}