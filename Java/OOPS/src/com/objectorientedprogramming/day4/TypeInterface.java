package com.objectorientedprogramming.day4;
interface  BankAccount{
        boolean UIWithdraw(double amount);
        boolean UIDeposit(double amount);
        void getBalance();
        }
class Savings implements BankAccount{
    private double balance;
    private double amount;
    @Override
    public boolean UIWithdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance -= amount;
            System.out.println("Transaction succesfull");
            return true;
        }
    }

    @Override
    public boolean UIDeposit(double amount) {
        balance+=amount;
        return true;
    }

    @Override
    public void getBalance() {
        System.out.println("balance:"+balance);
    }
}

public class TypeInterface {
    public static void main(String[] args) {
    BankAccount s =new Savings();
    s.UIDeposit(10000);
    s.UIWithdraw(60000);
    s.getBalance();
    }
}
