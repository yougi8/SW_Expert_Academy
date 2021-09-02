import java.util.Scanner;

// D2 - 1859. �鸸 ���� ������Ʈ
public class D2_q1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T; // test���̽��� ��
		T = sc.nextInt();
		
		for (int test_case=1; test_case<=T; test_case++) {
			int N; // ���� ������ �ŸŰ��� ��
			N = sc.nextInt();
			
			int[] price = new int[N];
			int max=0; // ������ �ŸŰ� �� �ְ�
			int max_index=0; // ������ �ŸŰ� �� �ְ��� ��ġ
			
			for (int day=0; day<N; day++) {
				price[day] = sc.nextInt();
			}
			
			/********** �� ���� �ִ� ���� Ÿ���� int�� �ƴ� long���� �ؾ���! int�� �ϸ� �뷮 �������� �������������������� ************/
			long benefit_total = 0; // �ִ� ����
			int start = 0;
			
			while(max_index!=N-1) {
				int benefit = 0;
				
				for(int i=start; i<N; i++) {
					if(price[i]>max) {
						max = price[i];
						max_index = i;
					}
				}
				
				
				for(int i=start; i<max_index; i++) {
					benefit += price[i]; // �ְ� �������� ������ ������
				}
				benefit = max*(max_index - start) - benefit;
			
				// �ƹ��͵� ���� ���� ���� �ִ������� ���
				if(benefit<0)
					benefit = 0;
				
				benefit_total += benefit;
				start = max_index+1;
				max = 0;
			}
			
			System.out.println("#"+test_case+" "+benefit_total);
			
		}

	}

}
