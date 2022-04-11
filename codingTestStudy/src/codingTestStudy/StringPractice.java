package codingTestStudy;

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
	
	
	
}
