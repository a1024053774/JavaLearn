package Chapter06;

import java.util.Scanner;

public class HomeWork03 {
    //编写类Book，定义方法updatePrice，
    // 实现更改某本书的价格，
    // 具体：如果价格>150，则更改为150，
    // 如果价格>100，更改为100，否则不变
    public static void main(String[] args) {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入价格(价格需大于0)");
        double price_input = scanner.nextDouble();
        double price_updated = book.updatePrice(price_input);
        if (price_updated == -1){
            System.out.println("您输入的价格有误,价格应该大于0");
        } else {
            System.out.println("更新后的价格是" + price_updated + "$");
        }
    }
}
class Book{
    public double updatePrice(double price){
        if (price > 150){
            return 150;
        } else if (price > 100) {
            return 100;
        } else if (price <= 0){

            return -1;
        } else {
            return price;
        }
    }
}
