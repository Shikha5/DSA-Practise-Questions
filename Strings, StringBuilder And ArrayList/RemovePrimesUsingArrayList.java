package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimesUsingArrayList {
	
	public static boolean checkIfPrime(int n) {
		boolean isPrime=true;
		for(int div=2;div*div<=n;div++) {
			if(n%div==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.print(al);
		

	}

	public static void solution(ArrayList<Integer> al) {
		
    	for(int i=0;i<al.size();i++) {
			int val=al.get(i);
			boolean isPrime=checkIfPrime(val);
			if(isPrime==true) {
				al.remove(i);
				i--;
			}
		}
		
	}

}
