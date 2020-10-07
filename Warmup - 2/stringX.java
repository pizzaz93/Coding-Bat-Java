public String stringX(String str) {
  if (str.length() < 2) {
    return str;
  }
  String cleanup = str.substring(1, str.length( )-1);
  cleanup = cleanup.replace('x',' ');
  String stringy = str.substring(0,1) + cleanup + str.substring(str.length()-1);
  stringy =stringy.replace(" ", "");
  
  return stringy;
}
/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
