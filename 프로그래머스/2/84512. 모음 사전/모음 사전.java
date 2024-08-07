class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] weights = {781, 156, 31, 6, 1}; // 각 자리에 따른 가중치 계산: (5^4-1)/4, (5^3-1)/4, (5^2-1)/4, (5^1-1)/4, (5^0-1)/4
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (word.charAt(i) == vowels[j]) {
                    answer += weights[i] * j + 1; // 해당 글자의 가중치에 그 위치의 인덱스를 곱하고, 단어의 위치 계산을 위해 1을 더함
                }
            }
        }
        
        return answer;
    }
}