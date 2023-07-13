package midTestQuesAll;

/*
Write a Java program or function which takes two strings as input and print common characters between 
them in alphabetical order. For example, if "thin sticks" and "thick bricks" are two given input strings then 
common characters between them in alphabetical order are [c, h, i, k, s, t]. 
*/

import java.util.Arrays;
import java.util.Scanner;

public class PrintCommon2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the Second String : ");
		String s2 = sc.nextLine();

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println("Common element in alphabetical order  : ");
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) 
		{
			if (arr1[i] == arr2[j]) 
			{
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}
	}
	

}
