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
		/* ÷���� for������ �ΰ��� �ΰ��� ���� ���� k�� �´��� Ȯ���ߴµ�, testcase 1���� �°� ���ư���.
		 * �翬�� 1���� �¾����� �ٸ� �׽�Ʈ���̽��� �� Ʋ�ȴ�..
		 * �ٷιٷ� �̰Ŵ� ������ ��� ������ ã�� ������ ������ �ΰ��� ���� ���� �� �� ���յ� �����ϴٴ� ��!
		 * ������ �ߵ� �� ������~ 
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
            
            /* �̷��� �ϸ� �ΰ����� ���չۿ� ���� ���� ����. �۷��Ծ��� ÷����
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
