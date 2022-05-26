package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.Scanner;

public class ToggleCaseUsingStrings {
	
//	radheykrishna
//	OUTPUT:
//	RADHEYKRISHNA
	
	public static String toggleCase(String str){
		String ans="";                        //Use SB instead of Strings because modification is required here! 
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch>'A'&&ch<'Z'){
		        char lc=(char)(ch+'a'-'A');
		        ans+=lc;
		    }
		    else{
		        char uc=(char)(ch+'A'-'a');
		        ans+=uc;
		    }
		   
		}
		 return ans;
	}

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	
	}

}
