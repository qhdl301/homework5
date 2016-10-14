package homework4;
import java.util.*;

public class ExamForWhile {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int selectedModule;
		
		do {
			System.out.println("1. 1부터 입력한 수까지 더하기");
			System.out.println("2. 최대값/최소값구하기");
			System.out.println("3. 입력받은숫자의 합계와 평균구하기");
			System.out.println("4. 원하는 구구단 출력하기 ");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 종료하기");
			System.out.print("원하는 메뉴는>> "); 
			selectedModule = s.nextInt();
			
			if(selectedModule == 1)
				new SumofNumbers().init();
			else if(selectedModule == 2)
				new MaxAndMin().init();
			else if(selectedModule == 3)
				new SumAndAvg().init();
			else if(selectedModule == 4)
				new GuGuDan().init();
			else if(selectedModule == 5)
				new GuGuDan2().init();
			
		} while(selectedModule != 6);
		
		System.out.println("시스템이 종료됩니다.");
	}
}