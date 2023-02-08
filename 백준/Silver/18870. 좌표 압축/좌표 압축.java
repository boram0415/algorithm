import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[Integer.parseInt(br.readLine())];
        int w =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 자연수 초기화
        while (st.hasMoreTokens()) {
            nums[w++] = Integer.parseInt(st.nextToken());
        }
        // TreeSet을 이용한 중복제거와 정렬
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // 중복제거 정렬된 값 담기
        int[] arr = new int[set.size()];
        Iterator i = set.iterator();
        int j = 0;
        while (i.hasNext()) {
            arr[j++] = Integer.parseInt(i.next().toString());
        }
        //이진탐색
        for (int x = 0; x < nums.length; x++) {
            int find = nums[x];
            int mid ;
            int left =0 , right =arr.length-1;
            while (left <= right) {

                mid= (right+left)/2;

                if (find == arr[mid]) {
                    sb.append(mid + " ");
                }

                if (find < arr[mid]) {
                    right = mid -1;
                }else{
                    left = mid +1;
                }

            }
        }

        System.out.println(sb);

    }
}
