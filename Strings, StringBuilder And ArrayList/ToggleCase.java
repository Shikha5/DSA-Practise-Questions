package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.Scanner;

public class ToggleCase {
	
//	pepCODing
//	OUTPUT:
//	PEPcodING

	public static String toggleCase(String str){
		StringBuilder sb=new StringBuilder(str);     //converting to SB because modification is required!

for(int i=0;i<sb.length();i++) {
	 char ch=sb.charAt(i);   
	 
	 if(ch>='A'&&ch<='Z') {
		 char lowerCase=(char) (ch+'a'-'A');
		 sb.setCharAt(i, lowerCase);
	 }
	 
	 else {
		 char upperCase=(char) (ch+'A'-'a');
		sb.setCharAt(i, upperCase);
	 }
}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
