class Solution {

    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int x = (int)Math.sqrt(n);

        // factor 2
        if (n % 2 == 0) {
            ans.add(2);
            while (n % 2 == 0) {
                n = n / 2;
            }
            x = (int)Math.sqrt(n); // updating because n changed
        }

        // odd factors
        for (int i = 3; i <= x; i += 2) {
            if (n % i == 0) {
                ans.add(i);
            }
            while (n % i == 0) {
                n = n / i;
            }
            x = (int)Math.sqrt(n); // update again because n changed
        }

        // leftover prime
        if (n > 1) {
            ans.add(n);
        }

        return ans;
    }

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = primeFac(n);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
    */
}
