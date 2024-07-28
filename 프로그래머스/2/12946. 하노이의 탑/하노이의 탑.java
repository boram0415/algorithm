import java.util.ArrayList;

class Solution {
    ArrayList<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);

        return moves.toArray(new int[moves.size()][2]);
    }

    private void hanoi(int n, int src, int aux, int dest) {
        if (n == 1) {
            moves.add(new int[]{src, dest});
            return;
        }

        hanoi(n-1, src, dest, aux);
        moves.add(new int[]{src, dest});
        hanoi(n-1, aux, src, dest);
    }
}