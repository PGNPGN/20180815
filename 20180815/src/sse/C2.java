package sse;

import java.util.Scanner;

public class C2 {
	Scanner scan = new Scanner(System.in);
	int num;
	double[] array;
	double mul=1;
	double max=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj = new C2();
		obj.getInput();
		obj.cal();
	}
	public void getInput() {
		num = scan.nextInt();
		array = new double[num];
		for(int i=0; i<num; i++) {
			array[i] = scan.nextDouble();
		}
	}
	
	public void cal() {
		for(int i=0; i<num; i++) {
			mul = 1;
			for(int j=i; j<num; j++) {
				mul *= array[j];
				if(mul>max)
					max = mul;
			}
		}
		System.out.printf("%.3f", max);
	}
}
