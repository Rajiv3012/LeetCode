import java.util.*;

public class Main {
    static class Solution {
        public int countPrimes(int n) {
            if (n <= 2) return 0;

            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);

            isPrime[0] = false;
            isPrime[1] = false;

            for (int i = 2; i * i < n; i++) {//i itself ko chor ke apne multiples ko false kr dega
                if (isPrime[i]) {
                    for (int j = i * i; j < n; j += i) { //yaha pe prev number jaise 5 ka ex lo 5*4 uske pehle waala 4 waala turn mai aayega which is automatically false
                        isPrime[j] = false; //5*5 se start krega kyuki piche ke phle hi false ho chuke
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.countPrimes(n);

        System.out.println("Number of primes less than " + n + " = " + result);
    }
}
