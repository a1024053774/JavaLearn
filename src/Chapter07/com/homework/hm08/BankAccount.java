package Chapter07.com.homework.hm08;

/**
 * 要求：（1）在上面类的基础上扩展展新类CheckingAccount对每次存款和取款都收取1美元的手续费
 * (2）扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生（earnMonthlyInterest方法被调用），并且有每月三次免手续费的存款或取款。
 * 在earnMonthlyInterest方法中重置交易计数（3）体会重写的好处
 */
public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

