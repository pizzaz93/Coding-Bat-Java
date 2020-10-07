public String withouEnd2(String str) {
  if (str.length() > 1){
  return str.substring(1, str.length()-1);
}
 if (str.length() == 1) {
   str = "";
 }
  
  return str;
    
  }
/*

Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

*/
