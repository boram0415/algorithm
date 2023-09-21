import java.util.*;
import java.io.*;

class Main{
    static HashMap<String,String> map = new HashMap<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map.put("Algorithm","204");
        map.put("DataAnalysis","207");
        map.put("ArtificialIntelligence","302");
        map.put("CyberSecurity","B101");
        map.put("Network","303");
        map.put("Startup","501");
        map.put("TestStrategy","105");
        
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0 ){
            System.out.println(map.get(br.readLine()));
        }
    }
}