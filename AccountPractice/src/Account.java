public class Account {

    private Double balance;
    private String customerName;
    private String email;
    private String phoneMumber;
    private String accountNumber;

    public void depositFunds (double depositAmmount){
        balance += depositAmmount;
        System.out.println("Deposit ammount is: " + depositAmmount + " New balance is: " + this.balance);
    }

    public void withdrawFunds (double withdrawFunds){
        if(balance - withdrawFunds >=0){
            balance -= withdrawFunds;
            System.out.println("Sum withdrawed is: " + withdrawFunds + " Remaining funs are: " + balance);
        }
        else {
            System.out.println("Balance:  " + balance + " is less tham requested Sum of: " + withdrawFunds  + " Request denied!");
        }
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneMumber(String phoneMumber) {
        this.phoneMumber = phoneMumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneMumber() {
        return phoneMumber;
    }



    public void AccountStatus() {
        System.out.println("Account number:  " + accountNumber + " Customer  " +
                customerName + " Balance: " +
                balance + " Phone Number: " +
                phoneMumber + " " + email + "Email");
    }
}
