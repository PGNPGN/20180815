package sse;

import java.util.Scanner;

public class C3 {
	Scanner scan = new Scanner(System.in);
	int[] array;
	int sum=0;
	boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 obj = new C3();
		obj.getInput();
		obj.sort();
		obj.cal();
		obj.print();
	}

	private void sort() {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0; i<9-1; i++) {
			for(int j=i; j<9; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public void getInput() {
		array = new int[9];
		for(int i=0; i<9; i++) {
			array[i] = scan.nextInt();
			sum += array[i];
		}
	}

	public void cal() {
		int smallSum = sum-100;
		for(int i=0; i<9-1; i++) {
			for(int j=i+1; j<9; j++) {
				if (array[i]+array[j]==smallSum) {
					array[i] = -1;
					array[j] = -1;
					flag = true;
					break;
				}
			}
			if(flag == true)
				break;
		}
	}

	public void print() {
		for(int i=0; i<9; i++) {
			if(array[i] >= 0)
				System.out.println(array[i]);
		}
	}
}
