import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int m = scanner.nextInt();
            int max = 0;
            HashMap<Integer,String> map = new HashMap<>();
            for(int j=0;j<m;j++){
                int cost = scanner.nextInt();
                String name = scanner.next();
                map.put(cost,name);
                max = Math.max(max,cost);
            }
            System.out.println(map.get(max));
        }
    }
}