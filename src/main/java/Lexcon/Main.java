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
    }
}