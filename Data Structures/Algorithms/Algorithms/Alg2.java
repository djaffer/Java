package Algorithms;

import java.util.Arrays;

public class Alg2 {

	public static int euclidGCD(int m, int n)// To find GCD of two numbers
	{
		if (m % n == 0) {
			return n;
		} else {
			return euclidGCD(n, m % n);
		}

	}

	public static int binarySearch(int[] num, int key) {
		int low = 0;
		int high = num.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (num[mid] == key) {
				return key;
			} else if (key < num[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static int[] insert(int num[], int value) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > value) {
				for (int j = num.length - 1; j > i; j--) {
					num[j] = num[j - 1];
				}
				num[i] = value;
				break;
			}

		}
		return num;
	}

	public static int[] delete(int[] num, int value) {

		for(int i =0;i<num.length;i++)
		{
			if(num[i]==value)
			{
				for(int j =i+1;j<num.length;j++)
				{
					num[j-1] = num[j];
				}
				break;
			}
			
		}
		return num;
	}

	public static void main(String[] args) {

		System.out.println(euclidGCD(56, 4));
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		System.out.println(binarySearch(ar, 6));

		int[] num = { 1, 2, 5, 6, 7, 8, 9, 100, 200, 0, 0 }; // 0 0 representing empty spots
		
		System.out.println(Arrays.toString(insert(num, 3)));
		System.out.println(Arrays.toString(delete(num,2)));
	}

}
