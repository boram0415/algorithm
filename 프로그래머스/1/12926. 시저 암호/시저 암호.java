class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(s.length());
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                answer.append(ch[i]);
                continue;
            }
            char base = Character.isLowerCase(ch[i]) ? 'a' : 'A';
            answer.append((char) ((ch[i] - base + n) % 26 + base));
        }

        return answer.toString();
    }
}
