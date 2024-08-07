import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Map<String, Integer> treeCountMap = new TreeMap<>(); // TreeMap을 사용하여 자동으로 사전 순 정렬

        int totalTrees = 0;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            treeCountMap.put(line, treeCountMap.getOrDefault(line, 0) + 1);
            totalTrees++;
        }

        StringBuilder sb = new StringBuilder();
        // 출력
        for (Map.Entry<String, Integer> entry : treeCountMap.entrySet()) {
            double percentage = (entry.getValue() * 100.0) / totalTrees;
            sb.append(entry.getKey())
              .append(" ")
              .append(String.format("%.4f", Math.round(percentage * 10000) / 10000.0))
              .append("\n");
        }

        System.out.print(sb.toString());
    }
}