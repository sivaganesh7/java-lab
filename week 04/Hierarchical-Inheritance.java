//hierachical inheritance
import java.util.Scanner;
class  bankaccount{
    static int amount=500;
    public void deposit(){
        // System.out.println("Deposit amount into general account: ");
        // Scanner s=new Scanner(System.in);
        // int dep_amount=s.nextInt();
        // amount+=dep_amount;
        // System.out.println("after deposit amount int0 account: "+amount);
    }
}
class savingsaccount extends bankaccount{
    public void deposit(){//overriding the super class deposit method
        System.out.println("Deposit amount into account: ");
        Scanner s=new Scanner(System.in);
        int dep_amount=s.nextInt();
        amount+=dep_amount;
        System.out.println("Deposited amount is: "+dep_amount);
    }
    
}
class checkaccount extends bankaccount{
    void checkbalance(){
        System.out.println("Balance in your account: "+amount);
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
    savingsaccount s=new savingsaccount();
    s.deposit();
    checkaccount c=new checkaccount();
    c.checkbalance();
}
}
