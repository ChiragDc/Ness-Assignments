package day3.objectorientedprogramming;
abstract class BankDetails{
    int amount;

    public BankDetails(int amount){
        this.amount = amount;
    }

    public abstract void curBalance(int amount);
}
 class UIWithdraw extends BankDetails{

     public UIWithdraw(int amount,int withdraw) {
         super(amount);
         curBalance(withdraw);
     }

     @Override
     public void curBalance(int withdraw) {
         System.out.println(amount-withdraw);
     }
 }
class UIDeposit extends BankDetails{

    public UIDeposit(int amount,int withdraw) {
        super(amount);
        curBalance(withdraw);
    }

    @Override
    public void curBalance(int withdraw) {
        System.out.println(amount+withdraw);
    }
}
public class AbstractMethods {
    public static void main(String[] args) {
      new UIWithdraw(10000,3000);
      new UIDeposit(12000,2000);



    }
}
