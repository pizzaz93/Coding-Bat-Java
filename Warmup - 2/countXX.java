int countXX(String str) {
  int counter = 0;
  int k = 0;
   for (int i = 0; i < str.length(); i++) {
      if (str.substring(i).length()  > 1) {
      
        k = i + 2;
        if (str.substring(i,k).equals("xx")) {
          counter++;
        }
   
      
      }
   
   }
   
    return counter;
}
/*

Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/
