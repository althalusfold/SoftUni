
public class BankAccount
{
    private String accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


    public BankAccount(String accountNumber, double balance, String firstName,String lastName, String email,
                   String phoneNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public  void addFunds(double deposit)
    {
            this.balance += deposit;
        System.out.println("New balance is: "+ this.balance);
    }

    public  void withdraw(double withdrawAmount)
    {
        if(this.balance - withdrawAmount < 0 )
        {
            System.out.println("Only " + this.balance +" available.");
        }
        else
        {
            this.balance -= withdrawAmount;
            System.out.println("Remaining balance is: "+ this.balance);
        }
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
        {
        this.phoneNumber = phoneNumber;
    }
}
