package homework4;
import java.util.*;

public class GuGuDan2 {
	String oddOrEven;
	int quitFlag;	//exit state
	
	void init() {
		do {
			if((this.quitFlag = this.input()) == 0)	//in case of loop
				this.print();
		} while(this.quitFlag == 0); //loop if not in exit state
		
		System.out.println("\n 프로그램5를 종료합니다. \n");
	}
	int input() {
		Scanner s = new Scanner(System.in);
		System.out.print("E:짝수단, O:홀수단(Q:종료) >> ");
		
		if((this.oddOrEven = s.next()).equals("Q"))
			return 1;
		
		return 0;
	}
	void print() {
		int startIndex;
		if(oddOrEven.equals("E"))
			startIndex = 2;
		else if(oddOrEven.equals("O"))
			startIndex = 3;
		for(int i=1;i<10;i++) {
			for(int j=startIndex;j<10;j+=2)
				System.out.format(" %d * %d  = %2d ", j, i, j*i);
			System.out.print("\n");
		}
	}
}
