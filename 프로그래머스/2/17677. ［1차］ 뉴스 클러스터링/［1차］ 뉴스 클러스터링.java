import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> m1 = toMultiset(str1);
        Map<String, Integer> m2 = toMultiset(str2);

        Set<String> keys = new HashSet<>(m1.keySet());
        keys.addAll(m2.keySet());

        if (keys.isEmpty()) return 65536;   

        int inter = 0, union = 0;
        for (String k : keys) {
            int a = m1.getOrDefault(k, 0);
            int b = m2.getOrDefault(k, 0);
            inter += Math.min(a, b);
            union += Math.max(a, b);
        }

        return (int) ((double) inter / union * 65536);
    }

    
    private Map<String, Integer> toMultiset(String s) {
        s = s.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i), c2 = s.charAt(i + 1);
            if (isAlpha(c1) && isAlpha(c2)) {
                String key = s.substring(i, i + 2);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        return map;
    }

    private boolean isAlpha(char c) {
        return c >= 'a' && c <= 'z';   
    }
}
