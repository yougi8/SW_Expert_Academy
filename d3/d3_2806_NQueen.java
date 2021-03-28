package d3;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

public class d3_2806_NQueen
{
    public static int[][] board;
    public static int result;
    public static int n;
    
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("input_2806.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n = sc.nextInt();
            board = new int[n][n];
            result=0;
            
            nqueen(0);
            
            System.out.println("#"+test_case+" "+result);
		}
	}
    
    public static void nqueen(int now){
     	   if(now==n){
			result++;
			return;
		}
		for(int i=0;i<n;i++){
			if(!isPossible(now, i)) continue;
			board[now][i]=1;
			nqueen(now+1);
			board[now][i]=0;
		}
    }
    
    public static boolean isPossible(int x, int y){
     	   for(int i=0;i<n;i++){
				if(i<=y && board[x][i]==1) return false;//За
				if(i<=x && board[i][y]==1) return false;//ї­

				if(x+i < n && y+i <n && board[x+i][y+i]==1) return false;
				if(x-i >= 0 && y-i >= 0 && board[x-i][y-i]==1) return false;
				if(x-i >= 0 && y+i < n && board[x-i][y+i]==1) return false;
				if(x+i < n && y-i >= 0 && board[x+i][y-i]==1) return false;
		}
		return true;
    }
}
