class Solution {
    public String solution(String strings) {
        String[] arr = strings.toLowerCase().split("");
        boolean check = true;
        StringBuilder sb = new StringBuilder();

        for(String s : arr){
            sb.append(check ? s.toUpperCase() : s);
            check = s.equals(" ");
        }
        return sb.toString();
    }
}