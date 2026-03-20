class Solution {
    public String addBinary(String a, String b) {
        // int x=Integer.valueOf(a,2);
        // int y=Integer.valueOf(b,2);

        // int sum=x+y;
        // return Integer.toBinaryString(sum);
                StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j =b.length()-1;

        int carry=0;

        while(i>=0||j>=0||carry==1){
            int currSum =carry; //carry humesha add hoga hi

            if(i>=0)currSum+=a.charAt(i--)-'0';
            if(j>=0)currSum+=b.charAt(j--)-'0';

            sb.append(currSum%2); //0+0=0, 0+1=1, 1+1=10 (2)
            carry=currSum/2; 
        }

        return sb.reverse().toString();
    }
}