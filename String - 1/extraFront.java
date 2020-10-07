public String extraFront(String str) {
 String result = "";
 if (str.length() > 0 && str.length() < 2) {
 result = str + str + str;
   
 }
 if (str.length() > 1) {
   result = str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
   return result;
 }
 return result;
}
/*

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
*/
