package ArrayPractice;

import java.io.*;
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
			System.out.print(arrList.get(i)+ "  ");
		}
	}
	public void CommonElements() throws IOException {
		InputStreamReader instr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(instr);
		
//		첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
//		두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//		세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
//		네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//		각 집합의 원소는 1,000,000,000이하의 자연수입니다.
		try {
			String size1 = br.readLine();
			String[] Elements1 = br.readLine().split(" ");
			
			String size2 = br.readLine();
			String Elements2 = br.readLine();
			int tempInt=0;

			if(Integer.parseInt(size1) > Integer.parseInt(size2)) {
				tempInt = Integer.parseInt(size1);
			}else {
				tempInt = Integer.parseInt(size2);
			}
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for(String s : Elements1) {
				if(Elements2.contains(s)) 
					temp.add(Integer.parseInt(s));
			}
			
			Collections.sort(temp);
			
			for(int s : temp) 
				System.out.print(s + " ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void MaxAmt() {
//		현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
//		만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
//		12 1511 20 2510 20 19 13 15
//		연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
//		여러분이 현수를 도와주세요.

//		10 3
//		12 15 11 20 25 10 20 19 13 15
		
//		56
		
		//슬라이딩 도어 방식을 이용해 해결

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		int [] amt = new int[n];
		int maxTemp = 0;
		
		for( int i =0; i < n ; i++) {
			amt[i] = s.nextInt();
			if(i < k) {
				maxTemp += amt[i];
			}
		}
		
		int temp =maxTemp;
		
		for (int i =k; i<n-k; i++) {
			temp  +=  amt[i] - amt[i-k];
			System.out.println(maxTemp);
			System.out.println(temp);
			if(maxTemp < temp) {
				maxTemp = temp;
			}
		}
		
		System.out.println(maxTemp);
		

	}
}
