class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int x = (int)Math.sqrt(n);
        if(n%2==0){
            ans.add(2);
            while(n%2==0){
                n=n/2;
            }
         x = (int)Math.sqrt(n);//baar baar n update hora
        }
        for(int i=3;i<=x;i=i+2){
            if(n%i==0){
                ans.add(i);
            }
            while(n%i==0){
                n=n/i;
            }
             x = (int)Math.sqrt(n);
        }
        if(n>1){
            ans.add(n);
        }
        return ans;
    }
}