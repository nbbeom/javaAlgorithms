package ArrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoPointer {
//	오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
	public void ArraySum() {
		Scanner sc = new Scanner(System.in);
		
		List arrList = new ArrayList();

		int n = sc.nextInt();
		HashSet hs = new HashSet();
		
		for(int i=0; i<n; i++) 
			arrList.add(sc.nextInt());
		
		int n2 = sc.nextInt();
		
		for(int i=0; i<n2; i++) 
			arrList.add(sc.nextInt());
		
		Collections.sort(arrList);
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+ " ");
		}
	}
}
