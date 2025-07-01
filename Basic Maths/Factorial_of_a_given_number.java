public class Factorial_of_a_given_number {
    public int factorial(int n) {
        int factorial = 1;
        if(n == 0 || n == 1){
            return factorial;
        }

        factorial = n * factorial(n-1);
        
        return factorial;
    }
}
