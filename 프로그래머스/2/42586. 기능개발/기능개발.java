import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        int cnt =1;
        
        // 스피드 만큼 진행된 프로세스 큐에 쌓기 
        for(int i = 0 ;i <  speeds.length ; i++){
            int a = (100 - progresses[i]) / speeds[i] ;
            int b = (100 - progresses[i]) % speeds[i];
            if(b > 0 ) a += 1;
            queue.offer(a);            
        }
    
        
        // 큐에서 앞보다 작거나 같으면 카운트 해서 결과 값에 쌓기 
          while(!queue.isEmpty()){
              
               int tmp = queue.poll();
               cnt = 1;
               while(!queue.isEmpty() && tmp >= queue.peek()){
                       cnt ++;           
                       queue.poll();
                   }
               result.add(cnt);
         }
     
     
        return result;
    }
}