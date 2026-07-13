class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String>q = new LinkedList<>();
        HashSet<String>set = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        if(set.contains("0000")){
            return -1;
        }
        q.offer("0000");
        visited.add("0000");
        int level =0;
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i<size;i++){
                String lock = q.poll();
                if(lock.equals(target)){
                    return level;
                }
                for(int j=0;j<4;j++){
                    char []arr= lock.toCharArray();
                    char origional = arr[j];
                    //forward jao
                    arr[j]=(char)((origional-'0'+1)%10+'0'); //+1 se forward
                    String next = new String(arr);
                    if(!set.contains(next) && !visited.contains(next)){
                        visited.add(next);
                        q.offer(next);
                    }
                    arr[j]=origional;
                    //backward jao
                    arr[j]=(char)((origional-'0'+9)%10+'0');
                    next=new String(arr);
                    if(!set.contains(next) && !visited.contains(next)){
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}