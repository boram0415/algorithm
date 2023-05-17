import java.io.*;
// 각 알파벳을 1과0으로 나눠 비교값을 스왑하는 형태로 알고리즘을 짤 것임.
public class Main {
        static String[] stringSwap(String[] arr, int idx){
            String temp ;
            temp = arr[idx];
            arr[idx] = arr[idx+1];
            arr[idx+1]=temp;
            return arr;
        }
        static int[] intSwap(int[] arr, int idx){
            int temp ;
            temp = arr[idx];
            arr[idx] = arr[idx + 1];
            arr[idx + 1] = temp;
            return arr;
        }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String emp = br.readLine();
        String a = br.readLine();
        String b = br.readLine();
        String[] arr = new String[a.length()+b.length()];
        int[] temp = new int[a.length()+b.length()];
        int cnt = Integer.parseInt(br.readLine());
        int idx =0;
        // 역순 배열에 담기
        for (int i = a.length()-1; i >= 0; i--) {
            arr[i] = a.charAt(idx++)+"";
        }
        idx=0;
        // 다음 알파벳 순서대로 담기
        for (int i = a.length(); i < arr.length; i++) {
            arr[i] = b.charAt(idx++)+"";
        }
        // 처음 역순으로 입력된(CBA) 값만큼 배열의 초기값 0에서 1로 재할당
        for (int i = 0; i < a.length(); i++) {
            temp[i]=1;
        }
        // 순회하며 스왑하기
        while (cnt > 0) {
            cnt--;
            for (int i = 0; i < temp.length-1; i++) {
                if (temp[i] != temp[i+1] && temp[i] != 0) {
                    arr = stringSwap(arr,i);
                    temp = intSwap(temp,i);
                    // 스왑 후 다음 인덱스부터 비교
                    i++;
                }
            }
        }
        // 출력
        StringBuilder sb = new StringBuilder();
        for (String alf : arr) {
            sb.append(alf);
        }
        System.out.println(sb);
    }
}