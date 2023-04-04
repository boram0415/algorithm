import java.util.*;


class Solution {
    public int solution(String[][] clothes) {
        
        int answer=1;
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++){
            String n = clothes[i][1];
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i: map.values()){
            answer *= (i+1);
        }
      	
        return answer-1;
    }
}
