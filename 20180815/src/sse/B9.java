package sse;

import java.util.Scanner;

public class B9 {

	Scanner scan = new Scanner(System.in);
	int totalnum=0;
	int[] array;
	int inputnum=0;
	int[] inputarray;
	int up=0;
	int down=0;
	boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B9 obj = new B9();
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
//		System.out.println("Still getting");
		
//		for(int i=0; i<totalnum; i++) {
//			System.out.print(array[i]+" ");
//		}
//		for(int i=0; i<inputnum; i++) {
//			System.out.print(inputarray[i]+" ");
//		}
	}

	public void findNum() {
		int s, e, m;

		for(int i=0; i<inputnum; i++) {
			s = 0; e = totalnum-1;
			flag = false;
			while(s<=e) {
				m = (s+e)/2;
				if(array[m]>inputarray[i]) {
					e = m-1;
				}else if(array[m]==inputarray[i]) {
					findLow(s, e, m, i);
					findUp(s, e, m, i);
					print();
					flag = true;
					break;
				}else
					s = m+1;
			}
			if(flag == false)
				System.out.print(0+" ");
		}
	}

	private void findUp(int s, int e, int m,int i) {
		// TODO Auto-generated method stub
		while(s<=e) {
			m = (s+e)/2;
			if(array[m]>inputarray[i]) {
				e = m-1;
			}else if(array[m]==inputarray[i]) {
				up = m;
				s = m+1;
			}
		}
	}

	private void findLow(int s, int e, int m, int i) {
		// TODO Auto-generated method stub
		while(s<=e) {
			m = (s+e)/2;
			if(array[m]<inputarray[i]) {
				s = m+1;
			}else if(array[m]==inputarray[i]) {
				down = m;
				e = m-1;
			}
		}
	}
	public void calBounds(int a) {
		down = 0;
		up = 0;
		for(int i=1; i<totalnum; i++) {
			try {
				if(array[a-i]==array[a]) {
					down++;
				}else if(array[a-i]!=array[a])
					break;
			}catch(ArrayIndexOutOfBoundsException e) {
				break;
			}

		}

		for(int i=1; i<totalnum; i++) {
			try {
				if(array[a+i]==array[a]) {
					up++;
				}else if(array[a+i]!=array[a])
					break;
			}catch(ArrayIndexOutOfBoundsException e) {
				break;
			}
		}

		print();
	}

	public void print() {
		if(down+up == 0) 
			System.out.print(1+" ");
		else
			System.out.print(up-down+1+" ");
	}
}
