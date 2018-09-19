package vn.codegym.QuyenLeSy;

import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();

        account.setter(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Id: " + account.getId());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Date: " + account.getDateCreated());
        System.out.println("MonthlyInterest: " + account.getMonthlyInterest());
    }
}
