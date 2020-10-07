public int[] front11(int[] a, int[] b) {
  if (a.length > 0 && b.length > 0) {
    int[] c = new int[2];
    c[0] = a[0];
    c[1] = b[0];
    return c;
  }
  if (a.length > 0 && b.length < 1) {
    int[] c = new int[1];
    c[0] = a[0];
    return c;
  }
  if (a.length < 1 && b.length > 0) {
    int[] c = new int[1];
    c[0] = b[0];
    return c;
  }
  
  int[] c = new int[0]; 
  return c;
}

/*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

*/
