class NQueensProblem{
	public static void main(String[] args){
		boolean[][] board = new boolean[4][4];
		System.out.println(queen(board,0));
	}
	static int queen(boolean[][] board,int row){
		if(row == board.length){
			display(board);
			return 1;
		}
		int count =0;
		for(int col=0;col<board.length;col++){
			if(isSafe(board,row,col)){
				board[row][col] = true;
				count=count+queen(board,row+1);
				board[row][col] = false;
			}
		}
		return count;
	}
	public static boolean isSafe(boolean[][] board,int r,int c){
		//for straightline
		for(int i =0;i<r;i++){
			if(board[i][c]){
				return false;
			}
		}
		//for left diagonal
		int max_left = Math.min(r,c);
		for(int i=1;i<=max_left;i++){
			if(board[r-i][c-i]){
				return false;
			}
		}
		//for right diagonal
		int max_right = Math.min(r,board.length-c-1);
		for(int i =1;i<=max_right;i++){
			if(board[r-i][c+i]){
				return false;
			}
		}
		return true;
	}
	public static void display(boolean[][] board){
		for(boolean[] arr : board){
			for(boolean ele : arr){
				if(ele == true){
					System.out.print("Q ");
				}
				else
					System.out.print("X ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
				