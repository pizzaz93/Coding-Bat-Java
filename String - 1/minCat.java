public String minCat(String a, String b) {
  String result ="";
  if (a.length() < b.length() ) {
    result = a + b.substring(b.length() - a.length());
    return result;
  }
  if (b.length() < a.length() ) {
    result = a.substring(a.length() - b.length()) + b;
    return result;
  }
  return result;
}
/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/
