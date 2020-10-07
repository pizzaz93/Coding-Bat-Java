public String missingChar(String str, int n) {
   int end = n+1 ;
   String miss1 = str.substring(0, n);
   if (str.length() > end){
    String miss2 = str.substring(end);
    String missing = miss1 + miss2;
    return missing;
     
   }
   return miss1;
}
/*Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"    
*/
