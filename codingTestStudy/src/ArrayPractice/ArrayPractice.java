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
}
