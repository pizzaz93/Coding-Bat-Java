boolean doubleX(String str) {
   for (int i = 0; i < str.length(); i++) {
     if ((str.substring(i).length() - 1) > 0) {
    if (str.substring(i,i +1).equals("x")) {
       if (str.substring(i + 1,i +2).equals("x")){
           return true;
       }
       return false;
    }
     
   }
  
 }
  return false;
}
/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
