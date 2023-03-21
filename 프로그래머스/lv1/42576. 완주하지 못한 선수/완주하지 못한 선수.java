import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String,Integer> Map = new HashMap<>();
        
        String answer ="";
        for(String i : participant) Map.put(i , Map.getOrDefault(i,0)+1);
        for(String i : completion) Map.put(i , Map.get(i)-1);
        
        for(String j : participant){
            if(Map.get(j) !=0){
                answer = j;
                break;
            }
        }
            
        return answer ;        
    }

}