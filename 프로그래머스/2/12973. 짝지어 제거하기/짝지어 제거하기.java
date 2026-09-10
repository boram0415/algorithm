import java.util.*;

class Solution
{
    public int solution(String s)
    {
	    int answer = 0 ;
        boolean flag = true;
        Deque<Character> stack = new ArrayDeque<>();
        
        
        for(char ch : s.toCharArray()){
        	if(!stack.isEmpty()){
        		if(stack.peek() == ch){
        			stack.pop();
        			continue;
        		}
        	}
        	stack.push(ch);
        }
        
        answer = stack.size() == 0 ? 1 : 0;

        return answer;
    }
}