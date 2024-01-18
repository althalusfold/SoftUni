public class Main {
    public static void main(String[] args) {
       Account account1 = new Account("54879", 800, "Pesho Petrov ", "ppetrov@abv.bg", "0898-223-545");
//        account1.setAccountNumber("54879");
//        account1.setCustomerName("Pesho Petrov");
//        account1.setBalance(800.00);
//        account1.setCustomerEmail("ppetrov@abv.bg");
//        account1.setCustomerNumber("0898-223-545");
//
//        account1.withdrawAmount(400);
//        account1.withdrawAmount(450);

        Account account2 = new Account("8897", 1000, "Nikola Dimitrov", "adf@abv.bg", "0894-555-254");
        Account account3 = new Account();
        System.out.println(account3.getAccountNumber());
        System.out.println(account3.getBalance());

        Account account4 = new Account("Kiro", "kiro@abv.bg", "0897-889-154");
        System.out.println("Account Number: "+ account4.getAccountNumber() + "; name "+ account4.getCustomerName());
    }
}
