public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //Empty constructor
    public  Account(){
        this("0000", 0.00, "No Name", "No email", "No phone number" );
        System.out.println("Empty constructor called!");
    }
    //Constructor
    public Account(String accountNumber, double balance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhoneNumber = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("9999", 100.55, customerName, customerEmail,customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public  void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposited amount: " + depositAmount + " New balance is: " + balance);
    }
    public void withdrawAmount(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("The request of: "+ withdrawalAmount + " cannot be done!"+ " Insufficient Funds! You only have: " + balance);
        }else{
            balance -= withdrawalAmount;
            System.out.println("Withdrawal amount is: "+ withdrawalAmount +" Balance remaining after withdrawal is: " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerPhoneNumber = customerNumber;
    }
}
