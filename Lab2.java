package EBI;

interface Sometest<T> {
    boolean test(T x, T y); // Use primitive boolean for performance
}

public class Lab2 {
    public static void main(String[] args) {
        // Define a lambda expression to check if one number is a factor of another
        Sometest<Double> isFactor = (n, d) -> (n % d == 0);

        // Test the lambda expression
        if (isFactor.test(10.0, 2.0)) {
            System.out.println("2 is a factor of 10");
        } else {
            System.out.println("2 is not a factor of 10");
        }
    }
}
