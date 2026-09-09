import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        // 무브 배열 만큼 스택에 쌓기 
        for (int m : moves ) {
            for (int i = 0 ; i < board.length ; i ++ ) {
                    int num =board[i][m-1];
                    if(num > 0 ){
                        board[i][m-1] = 0;
                        if(!stack.isEmpty() && stack.peek() == num){
                            stack.pop();
                            answer+=2;
                            break;
                        }
                        stack.push(num);
                        break;
                    }
                }
            }
        
          return answer;
        
        }
        
      
    }
