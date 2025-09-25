// Sort the array: Using Selection Sort

class SelectionSort {
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
			// find the max item in the remaining array and swap with correct index
			int last = nums.length - i - 1;     // last index
			int maxIndex = getMaxIndex(nums, 0, last);
			swap(nums, maxIndex, last);
		}
        return nums;
    }
    static int getMaxIndex(int arr[], int start, int end){
		int max = start;
		
		for(int i = start; i <= end; i++){
			if(arr[max] < arr[i]){
				max =  i;
			}
		}
		return max;
	} 
	
	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
    
}