// Two sum

import java.util.Arrays;
class TwoSum{
	
	public static int[] twoSum(int[] nums, int target){
		for(int i = 0; i < nums.length ; i++){
			for(int j = 0 ; j < i; j++){
				if(nums[i] + nums[j] == target){
					int result[] = new int[2];
					result[0] = i ;
					result[1] = j;
					return result;
				}
			}
		}
		return new int[]{};
	}
	public static void main(String args[]){
		int nums[] = {2,7,11,15};
		int[] result = twoSum(nums, 9);
		System.out.println(Arrays.toString(result));
	}

}

//[1, 0]