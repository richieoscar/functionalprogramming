package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("Oscar", "90949086");
        //normal java void function
        greetCustomer(customer);
        System.out.println();
        greetCustomerTwo(customer, false);
        System.out.println();

        //Consumer interface function
        Customer janeth = new Customer("Janeth", "090876543");
        greetCustomerConsumer.accept(janeth);

        System.out.println();
        //BiConsumer interface
        //All  BiFunctional interface take two parameter
        greetCustomerConsumerBi.accept(janeth, false);
    }


    //normal void java function
    public static void greetCustomer(Customer customer) {
        System.out.printf("%s %s, thanks for registering %s", "Hey", customer.customername, customer.customerPhone);
    }

    //normal java void function taking two arguments(equivalent to BiConsumer interface
    public static void greetCustomerTwo(Customer customer , boolean showPhone) {
        System.out.printf("%s %s, thanks for registering %s", "Hey",
                customer.customername, showPhone ? customer.customerPhone: "*****");
    }

    //Consumer functional interface
    //this is how to write void functions in java functional programming using  java functional interfaces
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.printf("%s %s, thanks for registering %s", "Hey",
                    customer.customername, customer.customerPhone);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerBi = (customer, showPhone) ->
            System.out.printf("%s %s, thanks for registering %s", "Hey",
                    customer.customername, showPhone ? customer.customerPhone : "*******");

    static class Customer {
        private final String customername;
        private final String customerPhone;

        public Customer(String customername, String customerPhone) {
            this.customername = customername;
            this.customerPhone = customerPhone;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customername='" + customername + '\'' +
                    ", customerPhone='" + customerPhone + '\'' +
                    '}';
        }
    }
}
