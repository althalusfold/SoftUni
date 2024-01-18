

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountNumber("123");
        account1.setBalance(800.00);
        account1.setCustomerName("Petrov");
        account1.setPhoneMumber("0889 899 111");
        account1.setEmail("abf@abv.bg");

        account1.depositFunds(100);
        account1.withdrawFunds(900);

    }
}
