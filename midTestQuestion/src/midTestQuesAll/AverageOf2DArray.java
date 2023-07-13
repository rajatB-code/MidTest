package midTestQuesAll;

import java.security.DomainCombiner;

public class AverageOf2DArray {
	
	public static void average(int brr[][])
	{
		int iSum = 0;
		int iAvg = 0;
		
		for(int i = 0; i < brr.length; i++)
		{
			iSum = 0;
			for(int j = 0; j < brr[i].length; j++)
			{
				iSum = iSum + brr[i][j];
			}
			System.out.println(iSum);
			iAvg = iSum/3;
			
			System.out.println("Rowise Average is : "+iAvg);
		}
		for(int i = 0; i < brr[i].length; i++)
		{
			iSum = 0;
			
			for(int j = 0; j < brr.length; j++)
			{
				iSum = iSum + brr[j][i];
			}
			System.out.println(iSum);
			
			iAvg = iSum/4;
			
			System.out.println("Columnwise Average is : "+iAvg);
		}
	}
		public static void main(String[] args) {
			int arr[][] = {{1,2,3},
				           {4,5,6},
					       {7,8,9},
					       {10,11,12}};
			//System.out.println(arr.length);
			//System.out.println(arr[0].length);
			AverageOf2DArray.average(arr);
		}
		}

