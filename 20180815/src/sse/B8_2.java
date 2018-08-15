package sse;

import java.util.Scanner;

public class B8_2 {
	
	Scanner scan = new Scanner(System.in);
	int totalnum=0;
	int[] array;
	int inputnum=0;
	int[] inputarray;
	
	int s, e;
	int m, sol;
	boolean flag = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B8_2 obj = new B8_2();
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
			for(int j=0; j<totalnum; j++) {
				if(array[j]==inputarray[i]) {
					flag = true;
					System.out.println(j+1);

				}
			}
			if(flag == false)
				System.out.println(0);
		}
	}
}
