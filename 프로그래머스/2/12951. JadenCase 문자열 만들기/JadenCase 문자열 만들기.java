class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean newWord = true;  // 새로운 단어의 시작을 추적

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                newWord = true;  // 공백 다음은 새로운 단어의 시작
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(c));  // 새로운 단어의 첫 글자는 대문자
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(c));  
                }
            }
        }
        return result.toString();
    }
}