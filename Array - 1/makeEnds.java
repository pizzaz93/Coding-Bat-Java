public int[] makeEnds(int[] nums) {
  int[] begend = new int[2];
  begend[0] = nums[0];
  begend[1] = nums[nums.length-1];
  return begend;
}
