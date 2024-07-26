import java.util.Arrays;

class Solution {
    public boolean solution(String[] phoneBook) {
        // 전화번호부를 정렬
        Arrays.sort(phoneBook);
        
        // 각 전화번호를 확인하여 다음 전화번호의 접두사인지 확인
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) {
                return false; // 접두사가 있는 경우 false 반환
            }
        }
        
        return true; // 접두사가 없는 경우 true 반환
    }
}