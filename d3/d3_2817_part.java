package d3;

import java.util.Scanner;
import java.io.FileInputStream;

public class d3_2817_part {

	public static int n;
	public static int k;
	public static int[] arr;
	public static int result;
	
	public static void main(String args[]) throws Exception
	{
		/* 첨에는 for문으로 두개씩 두개씩 더한 값이 k랑 맞는지 확인했는데, testcase 1에는 맞게 돌아갔다.
		 * 당연히 1번은 맞았지만 다른 테스트케이스는 다 틀렸다..
		 * 바로바로 이거는 가능한 모든 조합을 찾는 문제기 때문에 두개씩 조합 말고 세 개 조합도 가능하다는 것!
		 * 뻘짓을 했따 이 말이지~ 
		 * */
		
		System.setIn(new FileInputStream("input_2817.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int result = 0;
            
            solve(0,0);
            
            /* 이렇게 하면 두개씩의 조합밖에 나올 수가 없음. 글러먹었어 첨부터
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if( arr[i] + arr[j] == k ){
                        result++;
                    }
                }
            }*/
            
            System.out.println("#" + test_case + " " + result);
		}
	}
	
	static void solve(int idx, int sum) {
		if( sum > k ) return;
		if( sum == k ) {
			result++;
			return;
		}
		if( idx > n-1 ) return;
		solve( idx+1, sum );
		solve( idx+1, sum+arr[idx] );
	}
}
