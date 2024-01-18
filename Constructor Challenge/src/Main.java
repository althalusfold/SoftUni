public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Ivan Dimitrov", 8000, "dimitrov78@abv.bg");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer customer2 = new Customer();
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        Customer customer3 = new Customer("Gosho", "gosho@abv.bg");
        System.out.println(customer3.getCustomerName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}
