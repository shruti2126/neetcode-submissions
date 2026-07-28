class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<String, Set<Character>> squareMap = new HashMap<>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                
                String squareKey = (i/3)+ "-" + (j/3);
                boolean rowValSeen = rowMap.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]);
                boolean colValSeen = colMap.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]);
                boolean squareValSeen = squareMap.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[i][j]);

                if(rowValSeen || colValSeen || squareValSeen){ 
                    return false;
                }

                rowMap.get(i).add(board[i][j]);
                colMap.get(j).add(board[i][j]);
                squareMap.get(squareKey).add(board[i][j]);
                
            } 
        }
        return true;
    }
}
