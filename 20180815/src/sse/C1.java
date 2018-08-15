package sse;

import java.util.Scanner;

public class C1 {
	Scanner scan =new Scanner(System.in);
	int num = 0;
	int[] array;
	int total = 0;
	int s, m, e;
	int sol;
	int sum;
	int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		obj.getInput();
		obj.binarySearch();
	}
	
	public void getInput() {
		num = scan.nextInt();
		array = new int[num];
		for(int i=0; i<num; i++) {
			array[i] = scan.nextInt();
			if(array[i]>max)
				max = array[i];
		}
		total = scan.nextInt();
	}
	
	public void binarySearch() {
		s = 0; e = max;
		while(s<=e) {
			m = (s+e)/2;
//			System.out.println(m);
			if(cal(m)>total) {
				e = m-1;
			}else if(cal(m)<=total) {
				s = m+1;
				sol = m;
			}
		}
		System.out.println(sol);
	}

	private int cal(int m2) {
		// TODO Auto-generated method stub
		sum = 0;
//		System.out.println("calculate");
		for(int i=0; i<num; i++) {
			if(m2>array[i])
				sum += array[i];
			else if(m2<=array[i])
				sum += m2;
		}
		return sum;
	}
}
