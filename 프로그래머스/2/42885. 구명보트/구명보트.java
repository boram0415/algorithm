import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int twoSafe = 0; 
        Arrays.sort(people); 

        int left = 0; // 왼쪽 인덱스
        int right = people.length - 1; // 오른쪽 인덱스

        while (left < right) {
            if (people[left] + people[right] <= limit) {
                left++; 
                right--; 
                twoSafe++; 

            } else {
                right--; 
            }
        }

        return people.length - twoSafe;
    }
}
