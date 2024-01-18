// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if there are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.print's in the two methods above as well.

public class Bank
{
    public static void main(String[] args)
    {   //BankAccount(String accountNumber, double balance, String firstName,String lastName, String email, String phoneNumber)
        BankAccount acc125 = new BankAccount("125", 1000,"Peter", "Jameson","jameson-p@gmail.com","0879 888 999");

        acc125.withdraw(100);
        acc125.addFunds(100000);
        System.out.println("Account holder is: "+ acc125.getFirstName()+ " "+ acc125.getLastName()+" and balance is: "+ acc125.getBalance()+"$");

        VipPerson vip1 = new VipPerson();
        System.out.println(vip1.getName());

        VipPerson vip2 = new VipPerson("Bob", 25000.00);
        System.out.println(vip2.getName());

        VipPerson vip3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(vip3.getName());
        System.out.println(vip3.getEmailAddress());
    }
}

