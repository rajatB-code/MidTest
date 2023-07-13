package midTestQuesAll;

/*
 * To Find unique Pair Of Integers in Array whose Sum is Given Number Given array : [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] 
 * Given sum : 7 Integer numbers, whose sum is equal to value : 7 (2, 5) (4, 3) (-2, 9) , (7)
 */

public class FindPairs {
	
    public void getPairs(int arr[], int sum) 
	{
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if((arr[i] + arr[j])  == sum)
				{
					count++;
					
					System.out.println( "("+arr[i] + "," +arr[j] + ")" );
					
				}
			}
		}
		
	}
    
	
    public static void main(String[] args) {
		
    	int arr [] = { 2,4,3,5,6,-2,4,7,8,9} ;
    	
    	int sum = 7;
    	
    	FindPairs fp = new FindPairs();
    	fp.getPairs(arr, sum);
	}
}
