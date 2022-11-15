public class Kotak_Bank implements Bank{

    int accountNo;
    String name;
    int balance;

    double interestRate;

    public Kotak_Bank(int accountNo,String name,int balance,double interestRate) {
        this.accountNo = accountNo;
        this.name=name;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    @Override
    public void addMoney(int money) {
        balance=balance+money;
        System.out.println("your total balance is:"+balance);
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(money<=balance){
            balance=balance-money;
            System.out.println(money+"has been withdrawn");
            return true;
        }else{
            System.out.println("Insufficient Money");
            return false;
        }

    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterestOnBalance(int year) {
        double interest=(interestRate*year*balance)/100;
        return interest;
    }
}
