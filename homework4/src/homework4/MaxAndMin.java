package homework4;
import java.util.*;

public class MaxAndMin {
	int quitFlag, fstrndFlag = 1;	//exit state, first or not flag
	int compNum, maxNum, minNum;	//input number, maximum number, minimum number
	
	
	
	void init() {
		do {
			this.quitFlag = this.input();
		} while(this.quitFlag == 0); //loop if not in exit state
		
		print();
	}
	int input() {
		Scanner s = new Scanner(System.in);
		System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
		
		if(s.hasNextInt()) {
			this.compNum = s.nextInt();
			if(this.fstrndFlag == 1) {	//if first round of loop
				this.maxNum = this.compNum;	//initialize maximum number with the first entry
				this.minNum = this.compNum;	//initialize minimum number with the first entry
				this.fstrndFlag = 0;	//to indicate that later rounds are not the first round of loop
			}
			else {	//if not first round of loop
				if(this.compNum > this.maxNum)
					this.maxNum = this.compNum;
				else if(this.compNum < this.maxNum)
					this.minNum = this.compNum;
			}
		}
		else if(s.next().equals("Q"))	//if in need of exit
			return 1;
		
		return 0;	//if in need of loop
	}
	void print() {
		if(fstrndFlag == 0) 
			System.out.println("\n 가장 큰 수는 " + this.maxNum + " 가장 작은 수는 " + this.minNum);
		System.out.println("\n 프로그램2를 종료합니다. \n");
	}
}
