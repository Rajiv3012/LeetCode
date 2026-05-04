class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] cars = new int[n][2];//2 coloumns 
        for(int i=0;i<n;i++){
            cars[i][0]= position[i];
            cars[i][1]= speed[i];
        }
        Arrays.sort(cars,(a,b)->{
            return b[0]-a[0];//decrease mai sort kr diya
        });
        Stack<Double> st= new Stack<>();
        for(int[]car: cars){
            int pos = car[0];
            int spd= car[1];
            double time = (double)(target-pos)/spd;
            if(st.isEmpty()|| time>st.peek()){
                st.push(time);
            }
        }
        return st.size();

    }
}