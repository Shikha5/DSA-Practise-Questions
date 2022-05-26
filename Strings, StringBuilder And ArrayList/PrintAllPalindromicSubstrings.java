package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
	
//	abccbc
//	OUTPUT:
//	a
//	b
//	bccb
//	c
//	cc
//	c
//	cbc
//	b
//	c

	public static void solution(String str){
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {     //#"j<=str.length()"
				String sub=str.substring(i, j);
				boolean isPalindrome=checkIfPalindrome(sub);
				if(isPalindrome==true) {
					System.out.println(sub);
				}//if
				
			}//j
		}//i
		
	}//solution

	public static boolean checkIfPalindrome(String sub) {
		boolean isPalindrome=true;
		
		int left=0;
		int right=sub.length()-1;
		while(left<right) {
			char chleft=sub.charAt(left);
			char chright=sub.charAt(right);
			
			if(chleft!=chright) {
				isPalindrome=false;
				break;
			}//if
			left++;
			right--;
			
		}//while
		return isPalindrome;
	}//checkIfPalindrome

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}


}
