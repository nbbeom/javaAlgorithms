package ArrayPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		
//		int temp =0;
		int ans = 0;
		
		//time out err T_T O(n^2)
//		for(int i= 2; i<=num ; i++) {
//			for(int j =2; j<=i; j++) {
////				System.out.println(i%j);
//				if(i%j == 0) {
////					System.out.println("i :" + i+"j :" +j);
//					temp +=1;
//				}
//			}
//			if(temp == 1) {
//				ans+=1;
//			}
//			temp = 0;
//		}
		
		// 2의 배수 제거
		//시간을 반으로 줄여도 안되네 ㅋㅋㅋ;
//		int [] temp = new int[num+1];
//		
//		ans +=1; // 2는 소수이므로
//		for (int i = 1; i < temp.length/2; i++) {
//			int k = i*2+1;
//			if(temp[k]==0) {
//				for(int j =k+1; j<num+1; j++) {
//					if( temp[j] == 0) {
//						if(j%k == 0) {
//							temp[j] = 1; 
//						}
//					}
//					
//				}
//			}
//			if(temp[k]==0)
//				ans+=1;
//		}
//		System.out.println(ans);
		
		//고생할 문제는 아니었으나 생각을 많이했다..
		int answer = 0;
		int [] ch = new int[num+1];
		for(int i=2 ; i<num; i++) {
			if(ch[i] ==0) {
				answer++;
				for(int j=i;j<=num; j=j+i)
					ch[j]=1;
			}
		}
		
		System.out.println(answer);
	}
	
	public void ReversePrime() {
//		N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//		예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//		첫 자리부터의 연속된 0은 무시한다.
		 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String s;
			String result = "";
			StringBuilder build = new StringBuilder();

			for (int i = 0; i < n; i++) {
				
				s = build.append(sc.next()).reverse().toString();
				int num = Integer.parseInt(s);
				
				int count = 0;
				
				for (int j = 1; j <= num; j++) {
					if (num % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					result += num + " ";
				}
				build.setLength(0); //
			}
			System.out.println(result);
		
		//소수 응용
		
	}
	
	public void Bonus() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []nums = new int[n];
		int adds =0;
		int ans = 0;
		for(int i =0; i<n; i++) {
			nums[i] =sc.nextInt();
			if(nums[i] == 1) {
				ans= ans + adds + 1;
				adds++;
			}else {
				adds = 0;
			}
		}
		
		System.out.println(ans);
	}
	
	public void Score()  {
		
//		N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//		같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
//		즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int myScore = scan.nextInt();
		int P = scan.nextInt();
		int myRank = -1;
		int []ranking = new int[P];
		for(int i = 0; i < N; i++) {
			ranking[i] = scan.nextInt();
		}

		if (N == P && ranking[N - 1] >= myScore) myRank = -1;
		else {
			for (int i = 0; i < N; i++) {
				if (ranking[i] <= myScore) {
					myRank = i + 1;
					break;
				}
			}
			if (myRank == -1 && P > N) myRank = N;
		}

		System.out.println(myRank);
	}
	
	
	public void bingo() {
		Scanner sc = new Scanner(System.in);
		
		
		int n  = sc.nextInt();
		int[][] num = new int[n][n];
		//가로, 세로, 격자
		int max = 0;
		int cross = 0;
		int reCross = 0;
		
		int col =0;
		int coltemp = 0;
		int row =0;
		int rowtemp =0;
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				num[i][j] =sc.nextInt();
				//가로
				coltemp += num[i][j];
				//격자
				if(i==j) {
					cross += num[i][i];
				}else if(i+j == n-1)
					reCross += num[i][j];
			}	
			if(coltemp>col) {
				col = coltemp;
			}
			coltemp = 0;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				rowtemp +=num[j][i];
			}
			if(rowtemp>row) {
				row = rowtemp;
			}
			rowtemp = 0;
		}
		if(cross > reCross) {
			cross =cross;
		}else if(reCross > cross) {
			cross =reCross;
		}else {
			cross =reCross;
		}
		
		if(col > row) {
			max = col;
		}else if(row > col) {
			max = row;
		}else {
			max = row;
		}
		
		if(max > cross) {
			System.out.println(max);
		}else if (cross > max) {
			System.out.println(cross);
		}else {
			System.out.println(cross);
		}
			
		
	}
	
	public void mountain() {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[][] num = new int[n][n];
		
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int top = 0;
		for(int i=0; i<n; i++) 
			for(int j=0;j<n;j++)
				num[i][j] =sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 &&nx>=0 &&ny<n && num[nx][ny]>=num[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) top++;
			}
		}
		System.out.println(top);
		
		
	}
	
}
