public boolean nearHundred(int n) {
   if ((100 - n) <= 10 && n <= 110 || (200 - n) <= 10 && n <= 210) {
   return true;
     
   }
   
   return false;
}
// Given an int n, return true if it is within 10 of 100 or 200.
