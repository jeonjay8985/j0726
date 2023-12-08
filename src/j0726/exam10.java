package j0726;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s1=new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?");
		int count=s1.nextInt();
		int sum=0;//합계
		int realcount=0;//실제 더해진 갯수
		
		for(int i=1;i<=count;i++) {
			System.out.print("정수:");
			int num=s1.nextInt();
			if(num<0) {
				System.out.println("음수는 더하지 않습니다.");
			}else {
				sum=sum+num;
				realcount++;
			}
			
		}
		System.out.printf("합계는 %d입니다.\n",sum);
		System.out.printf("평균은 %.2f입니다.",(float)sum/realcount);
	}


	}


