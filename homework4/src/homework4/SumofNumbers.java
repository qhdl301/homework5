package homework4;
import java.util.*;

public class SumofNumbers {
	int sum, quitFlag, result = 0;
	
	void init() {
		do {
			this.result = 0;  //var. result initialized for consecutive math op.
			
			if((this.quitFlag = this.input()) == 0)	//in case of loop
				this.print();
		} while(this.quitFlag == 0);
		
		System.out.println("\n 프로그램1을 종료합니다. \n");
	}
	int input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("마지막 수를  입력(Q:종료) >> ");
		
		if(s.hasNextInt())
			this.sum = s.nextInt();
		else if(s.next().equals("Q"))
			return 1; //in case of exit
		
		return 0;	  //in case of loop
	}
	void print() {
		for(int i=1;i<=this.sum;i++)
			this.result += i;
		System.out.println("\n 총 합은 " + this.result + "입니다. \n");
	}
}