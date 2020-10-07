public String conCat(String a, String b) {
   String result = "";
   if (a.length() <1 || b.length() < 1){
     result = a+b;
     return result;
   }
   if (a.substring(a.length() - 1).equals(b.substring(0,1))){
     result = a + b.substring(1);
     return result;
   }
   result = a+b;
   return result;
}
/*

Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

*/
