package Chapter07.com.homework.hm08;

public class SavingAccount extends BankAccount {
    private double interestRate;
    private int freeTransactions;
    private int transactionCount;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
        this.interestRate = 0.1;
        this.freeTransactions = 3;// 每月三次免费交易
        this.transactionCount = 0; // 交易计数
    }
    @Override
    public void deposit(double amount) {
        transactionCount++;
        if (transactionCount > freeTransactions) {
            super.deposit(amount - 1); // 超过三次交易收取1美元手续费
        } else {
            super.deposit(amount);
        }

    }

    @Override
    public void withdraw(double amount) {
        transactionCount++;
        if (transactionCount > freeTransactions) {
            super.withdraw(amount + 1.0); // 取款时同样检查交易次数
        } else {
            super.withdraw(amount);
        }
    }

    public void earnMonthlyInterest() {
        double interest = getBalance() * interestRate / 12; // 计算月利息
        deposit(interest); // 添加利息到账户余额
        transactionCount = 0; // 重置交易计数
    }

    public double getBalance() {
        return super.getBalance();
    }
}
