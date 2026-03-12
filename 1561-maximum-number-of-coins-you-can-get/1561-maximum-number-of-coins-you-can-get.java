import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int total = 0;

        for (int i = n / 3; i < n; i += 2) {
            total += piles[i];
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];
        System.out.print("Enter piles: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println("Max coins: " + sol.maxCoins(piles));

        sc.close();
    }
}
