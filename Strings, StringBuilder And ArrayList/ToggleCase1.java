package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.Scanner;

public class ToggleCase1 {
	
//	rADHEYkRISHNA
//	OUTPUT:
//	RadheyKrishna

	public static String toggleCase(String str){
		StringBuilder sb=new StringBuilder(str);
		
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			
			if(ch>='A'&&ch<='Z') {
				ch=Character.toLowerCase(ch);
				sb.setCharAt(i, ch);
			}
			else {
				ch=Character.toUpperCase(ch);
				sb.setCharAt(i, ch);
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
