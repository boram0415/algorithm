import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int maxH = 0;
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // h-index 후보
            if (citations[i] >= h) {
                maxH = h;
                break;
            }
        }
        return maxH;
    }
}