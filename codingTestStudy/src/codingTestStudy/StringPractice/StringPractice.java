package codingTestStudy.StringPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice {
	
	public  int FindStr() {
		//#1
		//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
		//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.toUpperCase();
		System.out.println(str);
		char c = sc.next().charAt(0);
		
		c=Character.toUpperCase(c);
		System.out.println(c);
		int ans = 0;
		for(char x : str.toCharArray()) {
			if(x == c) {
				ans ++;
			}
		}
		return ans;
	}
	
	
	public String UNL() {
		//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String ans ="";
		for(char x : str.toCharArray()) {
			if(x > 97) {
				x = Character.toUpperCase(x);
			}else {
				x = Character.toLowerCase(x);
			}
			ans+=x;
		}
		
		
		return ans;
	}
	
	public String StrLen() {
		String ans ="";
		
		// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
		// 문장속의 각 단어는 공백으로 구분됩니다.

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] a = str.split(" ");
		
		for (String x : a) {
			if (x.length()>ans.length()) 
				ans = x;
		}

		
		return ans;
	}
	public String ReverseString() {
		String ans = "";
		//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<String> input = new ArrayList<String>(); 
		ArrayList<String> output = new ArrayList<String>(); 
		int num = sc.nextInt();
		String temp = "";
		String reverse = "";
		
		
		for(int i=0; i<num; i++) {
			input.add(sc.next());
			temp += input.get(i);
			
			for(int j = input.get(i).length()-1; j >= 0; j--) {
				reverse += Character.toString(temp.charAt(j));
			}
			output.add(reverse);
			reverse = "";
			temp = "";
		}
		
		for(String a : output) 
			System.out.println(a);
		
		return ans;
	}

	public String EngReverseString() {
		String ans = "";
		//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		char [] input = sc.nextLine().toCharArray(); 
		
		char temp ;
		
		int lt = 0, rt = input.length -1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(input[lt]))
				lt++;
			else if(!Character.isAlphabetic(input[rt]))
				rt--;
			else{
				temp = input[lt];
				input[lt] = input[rt];
				input[rt] = temp;
				
				lt++;
				rt--;
			}
		}
		ans = String.valueOf(input);
		System.out.println(ans);
		
		
		return ans;
	}
	public String DuplicationRemove() {
		String ans = "";
		//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		
		
		
		return ans;
	}
	public void IsCircular() {
//		앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//
//		문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);
		/*
		char[] word = sc.nextLine().toCharArray();
		
		//왼쪽 인덱스와 오른쪽 인덱스를 설정해줌.
		int lt = 0;
		int rt = word.length-1;
		while(lt<=rt) {
			if(Character.toLowerCase(word[lt]) != Character.toLowerCase(word[rt])) {
				System.out.println("NO");
				break;
			}else if(lt==rt || rt-lt == 1){
				System.out.println("YES");
			}
			lt ++;
			rt --;
		}
		
		*/
		String word = sc.nextLine();
		word = word.toLowerCase();
		
		String wordReverse = new StringBuilder(word).reverse().toString();
		
		
		if(word.equals(wordReverse)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public void TruePalindrome() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.toLowerCase().replaceAll("[^a-z]", "");
		
		String wordReverse = new StringBuilder(word).reverse().toString();
		
		
		if(word.equals(wordReverse)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		 
	}
	
	public void numberCollect() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
//		문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

//		만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

		word = word.replaceAll("[^0-9]", "");
		
		int number = Integer.parseInt(word);
		
		System.out.println(number);
		
		
	}
	public void MinDistance() {
		Scanner sc = new Scanner(System.in);
		
		char []  word = sc.nextLine().toCharArray();
		char alpha = sc.next().charAt(0);
		
//		한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
		
		
		int p= 1000 ;
		int [] answer = new int[word.length];
		for(int i = 0; i<word.length; i++) {
			if(word[i]==alpha) {
				p=0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p =1000;
		
		for(int i = word.length-1; i>=0; i--) {
			if(word[i]==alpha) {
				p=0;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}

		
		
		for(int i = 0; i< answer.length; i++)
			System.out.print(answer[i]+ " ");
		
		
	}
	
	
	public void ReString() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
//		알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//
//		문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//
//		단 반복횟수가 1인 경우 생략합니다.
		String answer = "";
		word = word +" ";
		int cnt =1;
		for (int i=0; i<word.length()-1;i++) {
			if(word.charAt(i)==word.charAt(i+1)) cnt++;
			else {
				answer+=word.charAt(i);
				if(cnt>1) answer+= String.valueOf(cnt);
				cnt=1;
			}
		}
		
		System.out.println(answer);

	}
	
	public void BIN() {
		Scanner sc = new Scanner(System.in);
		
//		현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
//
//		비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
//
//		비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
//
//		만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
//
//		1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
//
//		2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
//
//		3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
//
//		참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
//
//		현수가 4개의 문자를 다음과 같이 신호로 보냈다면
//
//		#****###**#####**#####**##**
//
//		이 신호를 4개의 문자신호로 구분하면
//
//		#****## --> 'C'
//
//		#**#### --> 'O'
//
//		#**#### --> 'O'
//
//		#**##** --> 'L'
//
//		최종적으로 “COOL"로 해석됩니다.
		int wordLength = Integer.parseInt(sc.nextLine());
		String word = sc.nextLine();
		
		int n =  word.length() / wordLength;
		
		char [] words = word.toCharArray();
		String ans = "";
		String bin ="";
		int temp  = 0;
		for(int i =0; i< wordLength ; i++) {
			bin ="";
			for(int j = 0; j < n ; j++) {
				if(words[temp] == '#') {
					bin += "1";
				}else if(words[temp] == '*') {
					bin += "0";
				}
				temp ++;
			}
			int b = Integer.parseInt(bin,2);
			char answord = (char) b;
			ans += answord;
		}
		System.out.println(ans);


		}
	
	
}
