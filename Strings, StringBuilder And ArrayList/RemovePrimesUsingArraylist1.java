package BasicsOfProgramming.StringStringBuilderAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimesUsingArraylist1 {
	
	public static boolean isPrime(int num){
        boolean isPrime = true;

        for(int div = 2; div * div <= num; div++){
            if(num % div == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

	public static void solution(ArrayList<Integer> al){
		// write your code here
        for(int i = al.size() - 1; i >= 0; i--){
            int val = al.get(i);
            boolean isThisValPrime = isPrime(val);
            if(isThisValPrime == true){
                al.remove(i);
            }
        }
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
		
	}

}
