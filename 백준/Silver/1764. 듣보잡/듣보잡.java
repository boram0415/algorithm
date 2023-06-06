import java.io.*;
import java.util.*;

class Main{
    public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        Set<String> tSet = new TreeSet<>();
        
        // 듣도 못한 사람 초기화
        for(int i=0;i<n;i++){
            set.add(br.readLine());
        }
        
        String str ;
        // 보도 못한 사람 입력받으면서 듣도 못한사람과 비교
        for(int i=0;i<m;i++){
            str = br.readLine();
            if(set.contains(str)){
                tSet.add(str);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        Iterator it = tSet.iterator();
        while(it.hasNext()){
            sb.append(it.next()).append("\n");
        }
        System.out.println(tSet.size() + "\n" + sb);
    }
    
}