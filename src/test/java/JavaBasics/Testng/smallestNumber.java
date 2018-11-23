package JavaBasics.Testng;

import java.util.Arrays;

public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5432,i=0;
		int array[] = new int[20] ;
		while(n!=0)
		{
			array[i]=n%10;
			n=n/10;
			++i;
			
		}
		Arrays.sort(array);
		for(int j=0;i< array.length;++i)
		System.out.println(array[0]);
	}

}
