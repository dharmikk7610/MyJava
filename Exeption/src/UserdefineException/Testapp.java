package UserdefineException;

public class Testapp {
    
    private static int balance = 1000; // Initial balance

    // Withdraw method with exception handling
    public static void Withdraw(int amount) throws Isvalidevalue {
        if (amount > balance) {
            throw new Isvalidevalue("Error: Not sufficient balance in your account.");
        }
        balance -= amount; // Deduct balance
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            Withdraw(500);   // Successful withdrawal
            Withdraw(1500);  // This will throw an exception
        } catch (Isvalidevalue e) {
            System.out.println(e.getMessage()); // Properly prints the exception message
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
