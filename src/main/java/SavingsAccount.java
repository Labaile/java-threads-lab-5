public class SavingsAccount {

  private long total = 0;

  public boolean withdraw(long amount) {
    if (total > 0) {
      total = total - amount;
      return true;
    } else {
    }return false;
  }
  public void deposit(long amount) {
         total = total + amount;
      System.out.println("Total: " + total);

  }

  public long getTotal() {
      return total;
  }
}