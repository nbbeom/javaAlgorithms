##문자열 다루기 / String
###문자열인덱싱
---
String str=””;
str.charAt(int index);
str.indexOf(String find);  
str.indexOf(String find, int from); 
str.contains(String str);
---
### to char array 
---
str.toCharArray();
str.split(“”)   // 각 문자들을 리스트로 만들거면 String[]을 사용하는 것이 편함
---
### 형변환
---
integer to String : Integer.toString(int i);   // str = “” + i; 
char to String : Character.toString(char c);  // str = “”+ c;
String to int : Integer.parseInt(str);
---
### substring , 대소문자변환 , 문자열길이
---
String sub = str.substring(int start, int end); // end 포함 안됨
str.toUpperCase();  str.toLowerCase();
str.length();
----
##문자열 다루기 / StringBuilder
---
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder(String str);
StringBuilder sb = new StringBuilder(char[] chars);
---
sb.append();
sb.insert(int index, String str);  // 위치에 삽입할때는 insert

sb.charAt(int index);
sb.indexOf(String str);

sb.subString(int start, int end);

sb.replace(int start, int end, String str);

sb.delete(int start, int end);

sb.reverse()

sb.length();
sb.toString();

기본형 다루기 / Integer, Character 

char to int : Character.getNumericValue(char c);  // int i = c – ‘a’;
char to String : Character.toString(char c); // String str = “”+c; 
             : String str = String.valueOf(char c);    // nullPointerException 없음
             : String str = new String(char[] cArray);

Character.isDigit();

---
String binaryStr = Integer.toBinary(int num);
int i = Integer.parseInt(binaryStr, 2);

Math.ceil();   
Math.floor();  
Math.sqrt();   
Math.pow(int i, int p);
Math.max(int a, int b);
Math.min(int a, int b);
Math.round(double d);
Math.abs(int i);

