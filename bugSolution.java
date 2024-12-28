public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0; 
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!"); // Handle the exception gracefully
            z = Integer.MAX_VALUE; // Or another suitable default value
        }
        System.out.println(z); 
    }
}