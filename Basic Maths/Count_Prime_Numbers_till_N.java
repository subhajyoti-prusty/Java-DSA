public class Count_Prime_Numbers_till_N {
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int primeUptoN(int n) {
        int prime_count = 0;

        if (n == 2) {
            prime_count = 1;
        }

        if (n >= 3) {
            prime_count = 2;
        }

        for (int i = 4; i <= n; i++) {
            if (isPrime(i))
                prime_count += 1;
        }
        return prime_count;
    }
}
