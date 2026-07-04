class Solution {
    public boolean exist(char[][] board, String word) {
        int track[][] = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(find(board, word, i, j, 0, track)) return true;        
            }
        }
        return false;
    }
    static public boolean find(char board[][], String word, int r, int c, int idx, int track[][]){
        if(idx == word.length()) return true;
        if(r >= board.length || c >= board[0].length || r < 0 || c < 0 || track[r][c] == 1 || board[r][c] != word.charAt(idx)) return false;
        
        track[r][c] = 1;
        boolean u = find(board, word, r - 1, c, idx + 1, track);
        boolean d = find(board, word, r + 1, c, idx + 1, track);
        boolean ri = find(board, word, r, c + 1, idx + 1, track);
        boolean l = find(board, word, r, c - 1, idx + 1, track);

        track[r][c] = 0;
        return u || d || ri || l;
    }
}