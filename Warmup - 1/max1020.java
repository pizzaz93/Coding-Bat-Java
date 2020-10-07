public int max1020(int a, int b) {
 if ((a > 20 || a < 10) && (b > 20 || b < 10)){
    return 0; 
 }
 
 if (a > 9 && a < 21 && b < 21 && b > 9){
   if (a > b){
     return a;
   }
   return b;
 }
 
 if (a < 21 && a > 9 && (b > 20 || b < 10)){
 
  return a; 
 }
 
 if (a > 20 || a < 10 && b < 21 && b > 9){
   return b;
 }
 
  return 0;
}
/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/
