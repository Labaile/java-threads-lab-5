public class Main {
    public static void main(String[] args) throws InterruptedException{
        SavingsAccount account1 = new SavingsAccount();
        account1.deposit(100);
        System.out.println( "Withdraw Amount:" + account1.withdraw(25));
        System.out.println( "Total: " + account1.getTotal());


    }
}
