package homework4;
import java.util.*;

public class SumofNumbers {
	Scanner s = new Scanner(System.in);
	int sum, quitFlag, result = 0;
	
	void init() {
		do {
			result = 0;
			if((quitFlag = this.input()) != 0)	//not in case of exit
				print();
		} while(quitFlag != 0);				    //state of needing calculation
		
		System.out.println("\n 프로그램1을 종료합니다. \n");
	}
	int input() {
		System.out.print("마지막 수를  입력(Q:종료) >> ");
		
		if(s.hasNextInt())
			this.sum = s.nextInt();
		else if(s.next().equals("Q"))
			return 0; //in case of exit
		
		return 1;	  //in need of calculation
	}
	void print() {
		for(int i=1;i<=this.sum;i++)
			this.result += i;
		System.out.println("\n 총 합은 " + result + "입니다. \n");
	}
}