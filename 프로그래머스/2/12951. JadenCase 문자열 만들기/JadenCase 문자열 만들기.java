class Solution {
    public String solution(String s) {
        String[] arr = s.toLowerCase().split("");
        boolean check = true;
        StringBuilder answer = new StringBuilder();

        for(String one : arr){
            answer.append(check ? one.toUpperCase() : one);
            check = one.equals(" ") ? true : false;
        }
        return answer.toString();
    }
}