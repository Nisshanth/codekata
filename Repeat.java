import java.util.*;
import java.io.*;
public class Repeat {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> rp = new ArrayList<Integer>();
		int ct=0;
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid Input");
		}
		else {
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(al.contains(num)) {
				if(!(rp.contains(num))) {
				rp.add(num);
				ct++;
			}
			}
			else {
				al.add(num);
			}
		}
		if(ct==0) {
			System.out.println("Null");
		}
		else {
			Collections.sort(rp);
		for(int i=0;i<ct;i++) {
			System.out.print(rp.get(i)+" ");
		}
	}
	}
	}
}