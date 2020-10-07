public int[] midThree(int[] nums) {
  int[] middle = new int[3];
  int middleNum = nums.length / 2;
  middle[0] = nums[middleNum - 1];
  middle[1] = nums[middleNum];
  middle[2] = nums[middleNum + 1];
  return middle;
}

/*

Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]

*/
