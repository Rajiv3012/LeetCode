class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n= asteroids.length;
        long newmass = mass;
        for(int i=0;i<n;i++){
            if(asteroids[i]>newmass){
                return false;
            }else{
                newmass+=asteroids[i];
            }
        }
        return true;
    }
}