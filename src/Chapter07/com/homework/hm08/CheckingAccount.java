package Chapter07.com.homework.hm08;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    private static final double FEE = 1.0;
    @Override
    public void deposit(double amount) {
        super.deposit(amount - FEE); // 扣除手续费后存入金额
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + FEE); // 取出金额加上手续费
    }
}
