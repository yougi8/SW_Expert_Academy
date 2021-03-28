package d3;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

public class d3_1208_flatten {

	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("input_1208.txt"));

		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
            int[] arr = new int[100];
            
            for(int i=0;i<100;i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
            	/* �� �κ��� �߾��µ� �� ��Ÿ�ͼ� ���ϱ� arrays.sort�̿��ϸ� �ȴٰ� ������ 
            	 * �غô��� �ٷ� ��~�� ���� ������ ������
                int max = -1;
                int min = 101;
                int maxIdx=0;
                int minIdx=0;
                for(int j=0;j<100;j++){
                 	if ( arr[j] > max ){
                     	max = arr[j];
                        maxIdx = j;
                    }
                    else if ( arr[j] < min ) {
                     	min = arr[j];
                        minIdx = j;
                    }
                }*/
                Arrays.sort(arr);
                
                arr[0]++;
                arr[99]--;
            }
            
            Arrays.sort(arr);
            int result = arr[99] - arr[0];
            
            System.out.println("#"+test_case+" " +result);
		}
	}
}