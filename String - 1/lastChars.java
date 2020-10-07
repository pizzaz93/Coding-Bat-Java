public String lastChars(String a, String b) {
  String aa = "";
  String bb = "";
  String result = "";
  if (a.length() < 1) {
    aa = "@";
    result = aa;
  }
  if (a.length() > 0) {
    result = a.substring(0,1);
  }  
  if (b.length() < 1) {
    bb = "@";
    result+=bb; 
  }

  if (b.length() > 0) {
    result += b.substring(b.length()-1);
  }
  return result; 
}
/*

Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

*/
