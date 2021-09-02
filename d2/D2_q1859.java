import java.util.Scanner;

// D2 - 1859. 백만 장자 프로젝트
public class D2_q1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T; // test케이스의 수
		T = sc.nextInt();
		
		for (int test_case=1; test_case<=T; test_case++) {
			int N; // 예측 가능한 매매가의 수
			N = sc.nextInt();
			
			int[] price = new int[N];
			int max=0; // 예측한 매매가 중 최고값
			int max_index=0; // 예측한 매매가 중 최고값의 위치
			
			for (int day=0; day<N; day++) {
				price[day] = sc.nextInt();
			}
			
			/********** 와 여기 최대 이익 타입을 int가 아닌 long으로 해야함! int로 하면 용량 부족으로 에러에러에러에러에러 ************/
			long benefit_total = 0; // 최대 이익
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
					benefit += price[i]; // 최고값 전까지의 이익을 더해줌
				}
				benefit = max*(max_index - start) - benefit;
			
				// 아무것도 사지 않을 때가 최대이익인 경우
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
