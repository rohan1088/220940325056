package ExamJava;
import java.util.*;

class BankAccount{
    int accno;
    double balance;

    public BankAccount(int accno,double Balance){
        this.accno=accno;
        this.balance=balance;

    }
    public void withdraw(double amount){
        if (balance<amount) {
            try {
                System.out.println("invalid ammount");
            } catch (Exception e) {
                System.out.println("Withrdawal ammount shoulde less than balance");
            }
        }
        else {
            balance=balance-amount;
            System.out.println("After withdrawl:"+balance);
        }
    }
    public void deposite(double amount){
        balance=balance-amount;
        System.out.println("balance after depositing"+balance);

    }
    public void show(){
        System.out.println("Account no:"+accno);
        System.out.println("balance amount:"+balance);
    }
}
public class Question2 {
    public static void main(String[] args) {
        BankAccount ba =new BankAccount(10,80);
        ba.show();
        ba.deposite(1000);
        ba.withdraw(1000);


    }
}
