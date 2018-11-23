package JavaBasics.Testng;

import java.util.Arrays;

public class sumOFsubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k=4,i=1,sum=0;
		Arrays.sort(arr);
		int n= arr.length-1;
		while(i<=k)
		{
			sum= sum+ arr[n];
			++i;--n;
		}
		System.out.println(sum);
		
			

	}

}
