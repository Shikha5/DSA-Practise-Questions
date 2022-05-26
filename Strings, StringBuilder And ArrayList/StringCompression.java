package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.Scanner;

public class StringCompression {
	
//	RRaddhhheeeyKKKKrrrishhhnnnaaa
	//OUTPUT:
//	RadheyKrishna
//	R2ad2h3e3yK4r3ish3n3a3
	
	public static String compression1(String str){
		String ans="";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				//nothing
			}
			else {
				ans=ans+str.charAt(i);
			}
		}
		
		ans+=str.charAt(str.length()-1) ;

		return ans;
	}
	
	public static String compression2(String str){
		String ans="";
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else {
				ans=ans+str.charAt(i);
				if(count>1) {
					ans+=count;
				}
				count=1;
			}
			
		}
		
		ans+=str.charAt(str.length()-1);
		if(count>1)
			ans+=count;

		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
