package Chapter06;

import java.util.Scanner;

public class HomeWork03 {
    //编写类Book，定义方法updatePrice，
    // 实现更改某本书的价格，
    // 具体：如果价格>150，则更改为150，
    // 如果价格>100，更改为100，否则不变
    public static void main(String[] args) {
        Book book = new Book("笑傲江湖",999);
        book.info();
        book.updatePrice();
        book.info();
    }
}
class Book{
    String name;
    double price;

    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){
        if (this.price > 150){
            price = 150;
        } else if (this.price > 100) {
            price = 100;
        } else if (this.price <= 0){
            System.out.println("价格不能为负数");
        } else {
            System.out.println("价格不变");
        }
    }

    public void info(){
        System.out.println("书名是" + name + ",价格是" + price + "$");
    }
}
