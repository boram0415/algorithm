import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean[] visited = new boolean[2000001];
        
		for (int i = 0; i < n; i++) {
			visited[Integer.parseInt(br.readLine())+1000000] = true;
		}
		
		for (int i = visited.length-1; i >= 0; i--) {
			if (!visited[i]) continue;
			bw.append((i-1000000)+"\n");
		}
        
		bw.flush();
        bw.close();
	}
}