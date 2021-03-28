package d3;
import java.util.Scanner;
import java.io.FileInputStream;

public class d3_2805_farm {

	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("input_2805.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int size = sc.nextInt();
            int[][] farm = new int[size][size];
            sc.nextLine();
            
            for(int i=0; i<size; i++){
                String temp = sc.nextLine();
                String[] temp2 = temp.split("");
                
             	   for(int j=0; j<size; j++){
                    	farm[i][j] = Integer.valueOf(temp2[j]);
                   }
            }
            
            int result = 0;
            int start = size/2;
            int count = 1;
            
            for(int i = 0; i<size/2; i++){
                int now = start;
                for(int j=0;j<count;j++){
                    result+=farm[i][now];
                    now++;
                }
                
                start = start - 1;
                count = count + 2;
            }
            
            for(int i = size/2; i<size; i++){
                int now = start;
                for(int j=0;j<count;j++){
                    result+=farm[i][now];
                    now++;
                }
                
                start = start + 1;
                count = count -2;
            }
           
        	System.out.println("#"+test_case+" "+result);
		}
        
	}
}
