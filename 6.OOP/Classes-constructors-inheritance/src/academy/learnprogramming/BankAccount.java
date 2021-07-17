package academy.learnprogramming;

public class BankAccount {

  private long accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private int phoneNumber;

  public long getAccountNumber() {
    return this.accountNumber;
  }
  public double getBalance() {
    return this.balance;
  }
  public String getCustomerName() {
    return this.customerName;
  }
  public String email() {
    return this.email;
  }
  public int getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setAccountNumber(long accountNumber){
    this.accountNumber = accountNumber;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setPhoneNumber(int phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  public void depositFunds (double funds) {
    this.balance += funds;
    System.out.println("Your new balance is " + this.balance);
  }
  public void withdrawFunds (double withdrawal){
    if(withdrawal > this.balance){
      System.out.println("Insufficient balance to make this operation");
    }else{
      this.balance -= withdrawal;
      System.out.println("Your new balance is " + this.balance);
    }
  }
}
