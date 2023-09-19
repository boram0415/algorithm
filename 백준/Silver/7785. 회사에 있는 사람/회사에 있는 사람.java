import java.io.*;
import java.util.*;

class Main{
    public static void main(String[]args) throws Exception{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> map = new HashMap<>();
        TreeSet<String> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            map.put(name,state);
        }

        for(String key : map.keySet()){
            if("enter".equals(map.get(key))){
                set.add(key);
            }
        }

        Iterator<String> itr=set.descendingIterator();	
        while(itr.hasNext()) {
            sb.append(itr.next()).append("\n");
        }
        System.out.print(sb);
    }
}
