public int[] makeMiddle(int[] nums) {
  int[] middle = new int[2];
  int divisor = nums.length /2;
  middle[0] = nums[divisor -1];
  middle[1] = nums[divisor];
  return middle;
}

/*


Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]


*/
