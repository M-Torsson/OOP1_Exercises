package Lexcon;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Adam", 1000);
        Customer customer1 = new Customer("Adam", acc1);

        customer1.getAccount().deposit(200);
        System.out.println("Customer Balance: " + customer1.getAccount().getBalance());
    }
}