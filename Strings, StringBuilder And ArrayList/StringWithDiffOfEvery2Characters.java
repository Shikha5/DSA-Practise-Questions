package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.Scanner;

public class StringWithDiffOfEvery2Characters {
	
//	acca
//  OUTPUT:	
//	a2c0c-2a
	
	public static String solution(String str){
		StringBuilder sb=new StringBuilder();
		int i=0;
		for(i=0;i<str.length()-1;i++){
		    char ch=str.charAt(i);
		    char chp1=str.charAt(i+1);
		    sb.append(ch);
		    sb.append(chp1-ch);
		}
		sb.append(str.charAt(i));

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}


}
