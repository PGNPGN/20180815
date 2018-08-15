package sse;

import java.util.Scanner;

public class C0 {
	Scanner scan = new Scanner(System.in);
	int num = 0;
	int[] place;
	int lo, up;
	int s, m, e;
	int loSol, upSol;
	int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C0 obj = new C0();
		obj.getInput();
		obj.sort();
		obj.calculate();

	}


	public void getInput() {
		num = scan.nextInt();
		place = new int[num];
		for(int i=0; i<num; i++) {
			place[i] = scan.nextInt();
		}
	}

	public void sort() {
		int temp = 0;
		for(int i=0; i<num-1; i++) {
			for(int j=i+1; j<num; j++) {
				if(place[i]>place[j]) {
					temp = place[i];
					place[i] = place[j];
					place[j] = temp;
				}
			}
		}
	}


	public void calculate() {
		for(int i=0; i<num-2; i++) {
			for(int j=i+1; j<num-1; j++) {
				lo = place[j]+ place[j]-place[i];
				up = place[j]+ 2*(place[j]-place[i]);
//				System.out.println("Grid"+lo+" "+up);
				lowSearch(j);
				upSearch(j);

				cnt += (upSol - loSol);
			}
		}
		System.out.println(cnt);
	}


	private void upSearch(int j) {
		// TODO Auto-generated method stub
		s=j; e=num-1;
		while(s<=e) {
			m = (s+e)/2;
			if(place[m]<=up) {
				s = m+1; upSol = m;
//				System.out.print(" j="+j+" s="+s+" m="+m+" e="+e+" upSol ="+upSol);
			}
			else if(place[m]>up) {e = m-1;}
		}
//		System.out.println(j+" "+upSol);
	}


	private void lowSearch(int j) {
		// TODO Auto-generated method stub
		s=j; e=num-1;
		while(s<=e) {
			m = (s+e)/2;
			if(place[m]>=lo) {
				e = m-1;
//				System.out.print(" j="+j+" s="+s+" m="+m+" e="+e+" loSol ="+loSol);
			}
			else if(place[m]<lo) {s = m+1; loSol = m;}
		}
//		System.out.println(j+" "+loSol);
	}
}
