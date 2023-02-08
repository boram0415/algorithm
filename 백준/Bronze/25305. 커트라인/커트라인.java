import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백두고 입력
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        // N수 배열 생성
        int nums[] = new int[Integer.parseInt(st.nextToken())];
        int k = Integer.parseInt(st.nextToken());
        // st 새로 선언하여 점수 담기
        st = new StringTokenizer(bf.readLine());
        int cnt=0;
        while (st.hasMoreTokens()) {
            nums[cnt++] = Integer.parseInt(st.nextToken());
        }
        //퀵정렬
        Arrays.sort(nums);
        System.out.println(nums[nums.length-k]);
    }
}
