package test;

class Solution01 { //카카오 인형뽑기 문제
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] result = new int[moves.length];
        int count = 0;
        
        for(int i=0; i<moves.length ;i++) {
        	int num = moves[i]-1;
        	for(int j=0;j<board.length;j++) {
        		if(board[j][num]>0) {
        			result[count] = board[j][num];
        			board[j][num] = 0;
        			count++;
        			break;
        		}
        	}
        	if(count>1) {
        		if(result[count-1]==result[count-2]) {
                	result[count-1] = 0;
                	result[count-2] = 0;
                	count-=2;
                	answer+=2;
                }	
        	}
        }
        
		return answer;
    }
}

public class CodingTest_01 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int r = s.solution(board, moves);
		System.out.println(r);
	}
}
