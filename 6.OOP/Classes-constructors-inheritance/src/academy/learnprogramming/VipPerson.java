package academy.learnprogramming;

public class VipPerson {

  private String name;
  private double creditLimit;
  private String email;

  public VipPerson() {
    this("Default name", 50000.00, "default@email.com");
  }

  public VipPerson(String name, double creditLimit) {
    this(name, creditLimit, "unknown@email.com");
  }

  public VipPerson(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
