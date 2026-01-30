public class SavingsAccount {
    public static void main(String[] args) {
        double balance = 1000; 
        double interestRate = 0.05; 

        double interest = balance * interestRate;
        double newBalance = balance + interest;

        System.out.println("Initial Balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("New Balance: " + newBalance);
    }
}
