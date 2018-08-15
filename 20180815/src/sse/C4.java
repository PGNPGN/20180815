package sse;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		int power = (int)Math.log10(a);
		long front;
		long back;
		int num = scan.nextInt();
		
		for(int i=1; i<power+1;i++) {
			front = (long)(a/Math.pow(10, i));
			back = (long)(a%Math.pow(10, i));
			if((front+back)==num) {
				System.out.println(front+"+"+back+"="+num);
			}else
				System.out.println("NONE");
			
			System.out.println(front+" "+back);
		}
		scan.close();
		System.out.println(power);
	}

}
