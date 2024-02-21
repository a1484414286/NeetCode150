class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    int row = 9;
    int col = 9;

    public boolean isValidSudoku(char[][] board) 
    {
        for(int x = 0; x < row; x ++)
        {
            for(int y = 0 ; y < col; y++)
            {
                String row = "Row "+ x +" "+ board[x][y];
                String col = "Col" + y +" "+ board[x][y];
                String sameBox = "Box" + x/3 + " " + y/3 + board[x][y];
                Character dot = '.';
                if(board[x][y] != dot)
                {
                    if(map.containsKey(row))
                    {
                        return false;
                    }
                    if(map.containsKey(col))
                    {
                        return false;
                    }
                    if(map.containsKey(sameBox))
                    {
                        return false;
                    }
                    map.put(col, 1);
                    map.put(row, 1);
                    map.put(sameBox, 1);
                }


            }
        }
        return true;
    }

}