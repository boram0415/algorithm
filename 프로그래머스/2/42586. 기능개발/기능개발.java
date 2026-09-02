import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        
        Deque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>(); 
        
        // 진행중 프젝과 스피드 비교해서 최대걸리는 일자 구하기
        for(int i =0; i< speeds.length ;i++){
            int tmp = (100-progresses[i]);
            int a = tmp / speeds[i];
            int b = tmp % speeds[i];
            if(b > 0) a +=1;
            queue.offer(a);
        }
        
        // 앞에 있는 숫자 보다 뒷 숫자가 작은경우 cnt 
        while(!queue.isEmpty()){
            int baseDay = queue.poll();
            int cnt =1;
            while(!queue.isEmpty() && queue.peek() <= baseDay){
                queue.poll();
                cnt++;
            }
            
            list.add(cnt);
        
        }
        
        // 결과 값 큐에 넣어 큐 크기만큼 배열 만들어 거기 다시 쌓아야 하나 ? 
        int[] answer = new int[list.size()];
        for(int i =0 ; i < list.size() ; i ++) answer[i] = list.get(i);
    
        return answer;
    }
}