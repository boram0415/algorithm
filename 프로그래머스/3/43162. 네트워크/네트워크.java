class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);  // i와 연결된 컴퓨터 전부 방문 처리
                answer++;                    // 네트워크 하나 완성
            }
        }
        
        return answer;
    }
    
    private void dfs(int[][] computers, boolean[] visited, int node) {
        visited[node] = true;
        
        for (int i = 0; i < computers.length; i++) {
            // 연결되어 있고(1), 아직 방문 안 했으면 그쪽으로 이동
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(computers, visited, i);
            }
        }
    }
}
