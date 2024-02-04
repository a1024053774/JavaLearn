package Chapter07.com.homework.hm08;

public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);//免手续费
        savingAccount.deposit(100);//免手续费
        savingAccount.deposit(100);//免手续费
        savingAccount.deposit(100);//扣手续费
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);//免手续费
        savingAccount.withdraw(100);//免手续费
        savingAccount.withdraw(100);//免手续费
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);//扣手续费
        System.out.println(savingAccount.getBalance());
    }
}
