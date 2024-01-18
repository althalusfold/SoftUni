public class Customer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    //Constructor chaining
    public Customer(){
        this("Nobody", "nobody@abv.bg");
    }

    public Customer(String customerName, String emailAddress) {
        this(customerName, 1000, emailAddress);
    }

    public Customer(String customerName, double creditLimit, String emailAddress){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
