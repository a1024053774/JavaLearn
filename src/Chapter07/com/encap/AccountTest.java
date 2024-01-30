package Chapter07.com.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("张三",19,"1111");
        System.out.println(account.accountInfo());
    }

}

class Account{

    private String name;
    private double balance;

    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() ==3 || name.length() == 4){
        this.name = name;}
        else {
            System.out.println("名字的长度应该为2位,3位或4位");
            this.name = "无名小卒";

        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20){
        this.balance = balance;}
        else {
            System.out.println("余额必须大于20,默认值设为21");
            this.balance = 21;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        } else {
            System.out.println("密码必须为6位,设为默认值");
            this.password = "123456";
        }
    }

    public String accountInfo(){
        return "姓名是" + this.name + " 余额是" + this.balance + " 密码是" + this.password;
    }
}