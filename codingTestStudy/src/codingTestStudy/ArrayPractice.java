package codingTestStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
	public void BiggestNum() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr= new int[num];
		
		for(int i =0; i<num; i++) {
			arr[i] = s.nextInt();
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(arr[0]);
		for (int i=1; i<num ; i++) {
			if(arr[i]>arr[i-1]) ans.add(arr[i]);
		}
		
		for (int x :ans) {
			System.out.print(x+" ");
		}
 		
	}
}
