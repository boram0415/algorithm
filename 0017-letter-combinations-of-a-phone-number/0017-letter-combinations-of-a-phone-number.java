import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] LETTERS = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index,
                           StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = LETTERS[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {
            current.append(letter);                         // 선택
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);     // 선택 취소
        }
    }
}
