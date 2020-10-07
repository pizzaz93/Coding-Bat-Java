public int[] swapEnds(int[] nums) {
  int[] swap = new int[nums.length];
  swap[0] = nums[nums.length -1];
  swap[swap.length-1] = nums[0];
  if (nums.length > 2){
    int i = 1;
    while (i != nums.length - 1){
      swap[i] = nums[i];
      i++;
    }
  }
  return swap;
}
/*

Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

*/
