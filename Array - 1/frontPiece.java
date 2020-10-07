public int[] frontPiece(int[] nums) {
  if (nums.length < 2){
    int[]twoddles = new int[nums.length];
    twoddles = nums;
    return twoddles;
  }
  int[] twoddles = new int[2];
  twoddles[0] = nums[0];
  twoddles[1] = nums[1];
  return twoddles;
}

/*


Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]


*/
