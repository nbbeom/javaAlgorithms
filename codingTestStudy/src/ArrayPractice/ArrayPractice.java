package ArrayPractice;

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
	
	public void VisibleStudent() {
		//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

		//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int[] arr = new int[num];
		int ans =0;
		for (int i = 0; i<num; i++) {
			arr[i] = s.nextInt();
		}
		
		int temp = 0;
		
		for (int a : arr) {
			if(temp < a) {
				ans+=1;
				temp = a;
			}
		}
		
		System.out.println(ans);
		
	}
	
	public void RCP() {
		//A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
		//1 가위 2바위 3 보
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		int[] arr2 = new int[num];

		for (int i = 0; i<num; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i<num; i++) {
			arr2[i] = s.nextInt();
			if(arr[i] == 1) {
				if(arr2[i] == 1) {
					System.out.println("D");
				}else if(arr2[i] == 2) {
					System.out.println("B");
				}else {
					System.out.println("A");
					
				}
			}else if(arr[i]==2) {
				if(arr2[i] == 1) {
					System.out.println("A");
				}else if(arr2[i] == 2) {
					System.out.println("D");
				}else {
					System.out.println("B");
					
				}
				
			}else {
				if(arr2[i] == 1) {
					System.out.println("B");
				}else if(arr2[i] == 2) {
					System.out.println("A");
				}else {
					System.out.println("D");
					
				}
				
			}
		}
		
	}
	
	public void pibonacci() {
//		1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
		
//		2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int [] ans = new int[num];
		ans[0] = 1;
		ans[1] = 1;
		System.out.printf(ans[0]+ " ");
		System.out.printf(ans[1]+ " ");
		for(int i = 2; i < num; i++) {
			ans[i] = ans[i-2] + ans[i-1];
			System.out.print(ans[i] +" ");
		}
	}
	
	
	public void Eratosthenes() {
		
//		자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//		만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다..
//		첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int [] ans = new int[num];
		
		
	}
	
	
}
