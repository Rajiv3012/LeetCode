class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int x = players.length;
        int y = trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int a=0,b=0,count=0;
        while(a<x && b<y){
            if(players[a]<=trainers[b]){
                count++;
                a++;
            }
            b++;
        }
        return count;
    }
}