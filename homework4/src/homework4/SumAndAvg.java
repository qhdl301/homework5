package homework4;
import java.util.*;

public class SumAndAvg {
	double avg;
	int quitFlag, sum = 0, sumCnt = 0;	//exit state, total sum, total op'ed count
	
	void init() {
		do {
			this.quitFlag = this.input();
		} while(this.quitFlag == 0); //loop if not in exit state
		
		print();
	}
	int input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력(Q:종료) >> ");	
		
		if(s.hasNextInt()) {
			this.sum += s.nextInt();
			this.sumCnt += 1;
		}
		else if(s.next().equals("Q"))
			return 1;
		
		return 0;
	}
	void print() {
		if(sumCnt > 0) {	//if more than zero entries have been made
			this.avg = sum/(double)sumCnt;
			System.out.printf("\n 합계는 %d이고, 평균은 %.2f입니다. \n", sum, avg);
		}
		System.out.println("\n 프로그램3을 종료합니다. \n");
	}
}
