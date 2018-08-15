package sse;

import java.util.Scanner;

public class B8 {
	Scanner scan = new Scanner(System.in);
	int totalnum=0;
	int[] array;
	int inputnum=0;
	int[] inputarray;
	
	int s, e;
	int m, sol;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B8 obj = new B8();
		obj.getInput();
		obj.findNum();

	}

	public void getInput() {
		totalnum = scan.nextInt();
		array = new int[totalnum];
		for(int i=0; i<totalnum; i++) {
			array[i] = scan.nextInt();
		}
		inputnum = scan.nextInt();
		inputarray = new int[inputnum];
		for(int i=0; i<inputnum; i++) {
			inputarray[i] = scan.nextInt();
		}
		scan.close();
	}

	public void findNum() {
		for(int i=0; i<inputnum; i++) {
			s=0; e=totalnum-1;
			m=0; sol=0;
			while(true) {
				m=(s+e)/2;
				if(array[m]>inputarray[i]) {
					e = m-1;
				}else if(array[m]<inputarray[i]) {
					s = m+1;
				}else if(array[m]==inputarray[i]) {
					sol = m; System.out.println(sol+1); break;
				}
				if(s>e) {
					System.out.println(sol);
					break;
				}
			}

		}
	}

}

