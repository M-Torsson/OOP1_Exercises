package Lexcon;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Adam", 1000);
        Customer customer1 = new Customer("Adam", acc1);

        customer1.getAccount().deposit(200);
        System.out.println("Customer Balance: " + customer1.getAccount().getBalance());

        Student s1 = new Student(1, "Alex", 22, "IT");
        Student s2 = new Student(2, "Sara", 21, "Engineering");

        System.out.println("Student 1: " + s1.getName());
        System.out.println("Student 2: " + s2.getName());

        Product p1 = new Product(1, "Phone", 500);
        Product p2 = new Product(2, "Laptop", 1000);

        System.out.println("Product 1 price: " + p1.getPrice());
        System.out.println("Product 2 price: " + p2.getPrice());

        Order order1 = new Order(1, p1, 2);
        System.out.println("Order ID: 1, Total: " + order1.calculateTotalPrice());
    }
}